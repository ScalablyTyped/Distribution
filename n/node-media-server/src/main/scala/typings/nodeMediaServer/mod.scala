package typings.nodeMediaServer

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-media-server", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NodeMediaServer {
    def this(config: Config) = this()
    
    /* CompleteClass */
    override def getSession(id: String): Map[String, Any] = js.native
    
    /* CompleteClass */
    override def on(
      eventName: String,
      listener: js.Function3[/* id */ String, /* StreamPath */ String, /* args */ js.Object, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def run(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait AuthConfig extends StObject {
    
    var play: js.UndefOr[Boolean] = js.undefined
    
    var publish: js.UndefOr[Boolean] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
  }
  object AuthConfig {
    
    inline def apply(): AuthConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthConfig] (val x: Self) extends AnyVal {
      
      inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var auth: js.UndefOr[AuthConfig] = js.undefined
    
    var fission: js.UndefOr[FissionConfig] = js.undefined
    
    var http: js.UndefOr[HttpConfig] = js.undefined
    
    var https: js.UndefOr[SslConfig] = js.undefined
    
    var logType: js.UndefOr[Double] = js.undefined
    
    var relay: js.UndefOr[RelayConfig] = js.undefined
    
    var rtmp: js.UndefOr[RtmpConfig] = js.undefined
    
    var trans: js.UndefOr[TransConfig] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: AuthConfig): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setFission(value: FissionConfig): Self = StObject.set(x, "fission", value.asInstanceOf[js.Any])
      
      inline def setFissionUndefined: Self = StObject.set(x, "fission", js.undefined)
      
      inline def setHttp(value: HttpConfig): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setHttps(value: SslConfig): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setLogType(value: Double): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
      
      inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
      
      inline def setRelay(value: RelayConfig): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
      
      inline def setRelayUndefined: Self = StObject.set(x, "relay", js.undefined)
      
      inline def setRtmp(value: RtmpConfig): Self = StObject.set(x, "rtmp", value.asInstanceOf[js.Any])
      
      inline def setRtmpUndefined: Self = StObject.set(x, "rtmp", js.undefined)
      
      inline def setTrans(value: TransConfig): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
      
      inline def setTransUndefined: Self = StObject.set(x, "trans", js.undefined)
    }
  }
  
  trait FissionConfig extends StObject {
    
    var ffmpeg: String
    
    var tasks: js.Array[FissionTaskConfig]
  }
  object FissionConfig {
    
    inline def apply(ffmpeg: String, tasks: js.Array[FissionTaskConfig]): FissionConfig = {
      val __obj = js.Dynamic.literal(ffmpeg = ffmpeg.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
      __obj.asInstanceOf[FissionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FissionConfig] (val x: Self) extends AnyVal {
      
      inline def setFfmpeg(value: String): Self = StObject.set(x, "ffmpeg", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[FissionTaskConfig]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: FissionTaskConfig*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
  
  trait FissionTaskConfig extends StObject {
    
    var model: js.Array[FissionTaskModel]
    
    var rule: String
  }
  object FissionTaskConfig {
    
    inline def apply(model: js.Array[FissionTaskModel], rule: String): FissionTaskConfig = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[FissionTaskConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FissionTaskConfig] (val x: Self) extends AnyVal {
      
      inline def setModel(value: js.Array[FissionTaskModel]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelVarargs(value: FissionTaskModel*): Self = StObject.set(x, "model", js.Array(value*))
      
      inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  trait FissionTaskModel extends StObject {
    
    var ab: String
    
    var vb: String
    
    var vf: String
    
    var vs: String
  }
  object FissionTaskModel {
    
    inline def apply(ab: String, vb: String, vf: String, vs: String): FissionTaskModel = {
      val __obj = js.Dynamic.literal(ab = ab.asInstanceOf[js.Any], vb = vb.asInstanceOf[js.Any], vf = vf.asInstanceOf[js.Any], vs = vs.asInstanceOf[js.Any])
      __obj.asInstanceOf[FissionTaskModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FissionTaskModel] (val x: Self) extends AnyVal {
      
      inline def setAb(value: String): Self = StObject.set(x, "ab", value.asInstanceOf[js.Any])
      
      inline def setVb(value: String): Self = StObject.set(x, "vb", value.asInstanceOf[js.Any])
      
      inline def setVf(value: String): Self = StObject.set(x, "vf", value.asInstanceOf[js.Any])
      
      inline def setVs(value: String): Self = StObject.set(x, "vs", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpConfig extends StObject {
    
    var allow_origin: js.UndefOr[String] = js.undefined
    
    var mediaroot: String
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object HttpConfig {
    
    inline def apply(mediaroot: String): HttpConfig = {
      val __obj = js.Dynamic.literal(mediaroot = mediaroot.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpConfig] (val x: Self) extends AnyVal {
      
      inline def setAllow_origin(value: String): Self = StObject.set(x, "allow_origin", value.asInstanceOf[js.Any])
      
      inline def setAllow_originUndefined: Self = StObject.set(x, "allow_origin", js.undefined)
      
      inline def setMediaroot(value: String): Self = StObject.set(x, "mediaroot", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait NodeMediaServer extends StObject {
    
    def getSession(id: String): Map[String, Any]
    
    def on(
      eventName: String,
      listener: js.Function3[/* id */ String, /* StreamPath */ String, /* args */ js.Object, Unit]
    ): Unit
    
    def run(): Unit
    
    def stop(): Unit
  }
  object NodeMediaServer {
    
    inline def apply(
      getSession: String => Map[String, Any],
      on: (String, js.Function3[/* id */ String, /* StreamPath */ String, /* args */ js.Object, Unit]) => Unit,
      run: () => Unit,
      stop: () => Unit
    ): NodeMediaServer = {
      val __obj = js.Dynamic.literal(getSession = js.Any.fromFunction1(getSession), on = js.Any.fromFunction2(on), run = js.Any.fromFunction0(run), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[NodeMediaServer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeMediaServer] (val x: Self) extends AnyVal {
      
      inline def setGetSession(value: String => Map[String, Any]): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
      
      inline def setOn(
        value: (String, js.Function3[/* id */ String, /* StreamPath */ String, /* args */ js.Object, Unit]) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait RelayConfig extends StObject {
    
    var ffmpeg: String
    
    var tasks: js.Array[RelayTaskConfig]
  }
  object RelayConfig {
    
    inline def apply(ffmpeg: String, tasks: js.Array[RelayTaskConfig]): RelayConfig = {
      val __obj = js.Dynamic.literal(ffmpeg = ffmpeg.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayConfig] (val x: Self) extends AnyVal {
      
      inline def setFfmpeg(value: String): Self = StObject.set(x, "ffmpeg", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[RelayTaskConfig]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: RelayTaskConfig*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
  
  trait RelayTaskConfig extends StObject {
    
    var app: String
    
    var edge: String
    
    var mode: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var rtsp_transport: js.UndefOr[String] = js.undefined
  }
  object RelayTaskConfig {
    
    inline def apply(app: String, edge: String, mode: String): RelayTaskConfig = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayTaskConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayTaskConfig] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setEdge(value: String): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRtsp_transport(value: String): Self = StObject.set(x, "rtsp_transport", value.asInstanceOf[js.Any])
      
      inline def setRtsp_transportUndefined: Self = StObject.set(x, "rtsp_transport", js.undefined)
    }
  }
  
  trait RtmpConfig extends StObject {
    
    var chunk_size: js.UndefOr[Double] = js.undefined
    
    var gop_cache: js.UndefOr[Boolean] = js.undefined
    
    var ping: js.UndefOr[Double] = js.undefined
    
    var ping_timeout: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var ssl: js.UndefOr[SslConfig] = js.undefined
  }
  object RtmpConfig {
    
    inline def apply(): RtmpConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RtmpConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RtmpConfig] (val x: Self) extends AnyVal {
      
      inline def setChunk_size(value: Double): Self = StObject.set(x, "chunk_size", value.asInstanceOf[js.Any])
      
      inline def setChunk_sizeUndefined: Self = StObject.set(x, "chunk_size", js.undefined)
      
      inline def setGop_cache(value: Boolean): Self = StObject.set(x, "gop_cache", value.asInstanceOf[js.Any])
      
      inline def setGop_cacheUndefined: Self = StObject.set(x, "gop_cache", js.undefined)
      
      inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
      
      inline def setPing_timeout(value: Double): Self = StObject.set(x, "ping_timeout", value.asInstanceOf[js.Any])
      
      inline def setPing_timeoutUndefined: Self = StObject.set(x, "ping_timeout", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSsl(value: SslConfig): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  trait SslConfig extends StObject {
    
    var cert: String
    
    var key: String
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object SslConfig {
    
    inline def apply(cert: String, key: String): SslConfig = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SslConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SslConfig] (val x: Self) extends AnyVal {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait TransConfig extends StObject {
    
    var ffmpeg: String
    
    var tasks: js.Array[TransTaskConfig]
  }
  object TransConfig {
    
    inline def apply(ffmpeg: String, tasks: js.Array[TransTaskConfig]): TransConfig = {
      val __obj = js.Dynamic.literal(ffmpeg = ffmpeg.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransConfig] (val x: Self) extends AnyVal {
      
      inline def setFfmpeg(value: String): Self = StObject.set(x, "ffmpeg", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[TransTaskConfig]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: TransTaskConfig*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
  
  trait TransTaskConfig extends StObject {
    
    var ac: js.UndefOr[String] = js.undefined
    
    var acParam: js.UndefOr[js.Array[String]] = js.undefined
    
    var app: String
    
    var dash: js.UndefOr[Boolean] = js.undefined
    
    var dashFlags: js.UndefOr[String] = js.undefined
    
    var hls: js.UndefOr[Boolean] = js.undefined
    
    var hlsFlags: js.UndefOr[String] = js.undefined
    
    var mp4: js.UndefOr[Boolean] = js.undefined
    
    var mp4Flags: js.UndefOr[String] = js.undefined
    
    var rtmp: js.UndefOr[Boolean] = js.undefined
    
    var rtmpApp: js.UndefOr[String] = js.undefined
    
    var vc: js.UndefOr[String] = js.undefined
    
    var vcParam: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TransTaskConfig {
    
    inline def apply(app: String): TransTaskConfig = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransTaskConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransTaskConfig] (val x: Self) extends AnyVal {
      
      inline def setAc(value: String): Self = StObject.set(x, "ac", value.asInstanceOf[js.Any])
      
      inline def setAcParam(value: js.Array[String]): Self = StObject.set(x, "acParam", value.asInstanceOf[js.Any])
      
      inline def setAcParamUndefined: Self = StObject.set(x, "acParam", js.undefined)
      
      inline def setAcParamVarargs(value: String*): Self = StObject.set(x, "acParam", js.Array(value*))
      
      inline def setAcUndefined: Self = StObject.set(x, "ac", js.undefined)
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setDash(value: Boolean): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
      
      inline def setDashFlags(value: String): Self = StObject.set(x, "dashFlags", value.asInstanceOf[js.Any])
      
      inline def setDashFlagsUndefined: Self = StObject.set(x, "dashFlags", js.undefined)
      
      inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
      
      inline def setHls(value: Boolean): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
      
      inline def setHlsFlags(value: String): Self = StObject.set(x, "hlsFlags", value.asInstanceOf[js.Any])
      
      inline def setHlsFlagsUndefined: Self = StObject.set(x, "hlsFlags", js.undefined)
      
      inline def setHlsUndefined: Self = StObject.set(x, "hls", js.undefined)
      
      inline def setMp4(value: Boolean): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
      
      inline def setMp4Flags(value: String): Self = StObject.set(x, "mp4Flags", value.asInstanceOf[js.Any])
      
      inline def setMp4FlagsUndefined: Self = StObject.set(x, "mp4Flags", js.undefined)
      
      inline def setMp4Undefined: Self = StObject.set(x, "mp4", js.undefined)
      
      inline def setRtmp(value: Boolean): Self = StObject.set(x, "rtmp", value.asInstanceOf[js.Any])
      
      inline def setRtmpApp(value: String): Self = StObject.set(x, "rtmpApp", value.asInstanceOf[js.Any])
      
      inline def setRtmpAppUndefined: Self = StObject.set(x, "rtmpApp", js.undefined)
      
      inline def setRtmpUndefined: Self = StObject.set(x, "rtmp", js.undefined)
      
      inline def setVc(value: String): Self = StObject.set(x, "vc", value.asInstanceOf[js.Any])
      
      inline def setVcParam(value: js.Array[String]): Self = StObject.set(x, "vcParam", value.asInstanceOf[js.Any])
      
      inline def setVcParamUndefined: Self = StObject.set(x, "vcParam", js.undefined)
      
      inline def setVcParamVarargs(value: String*): Self = StObject.set(x, "vcParam", js.Array(value*))
      
      inline def setVcUndefined: Self = StObject.set(x, "vc", js.undefined)
    }
  }
}
