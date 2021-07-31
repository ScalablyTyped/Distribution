package typings.nssm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(serviceName: String): Nssm = ^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any]).asInstanceOf[Nssm]
  @scala.inline
  def apply(serviceName: String, options: NssmOptions): Nssm = (^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Nssm]
  
  @JSImport("nssm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CallbackFn = js.Function2[/* error */ js.UndefOr[String], /* result */ js.UndefOr[String], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nssm.nssmStrings.install
    - typings.nssm.nssmStrings.remove
    - typings.nssm.nssmStrings.start
    - typings.nssm.nssmStrings.stop
    - typings.nssm.nssmStrings.restart
    - typings.nssm.nssmStrings.status
    - typings.nssm.nssmStrings.pause
    - typings.nssm.nssmStrings.continue
    - typings.nssm.nssmStrings.rotate
    - typings.nssm.nssmStrings.get
    - typings.nssm.nssmStrings.set
    - typings.nssm.nssmStrings.reset
  */
  trait Command extends StObject
  object Command {
    
    @scala.inline
    def continue: typings.nssm.nssmStrings.continue = "continue".asInstanceOf[typings.nssm.nssmStrings.continue]
    
    @scala.inline
    def get: typings.nssm.nssmStrings.get = "get".asInstanceOf[typings.nssm.nssmStrings.get]
    
    @scala.inline
    def install: typings.nssm.nssmStrings.install = "install".asInstanceOf[typings.nssm.nssmStrings.install]
    
    @scala.inline
    def pause: typings.nssm.nssmStrings.pause = "pause".asInstanceOf[typings.nssm.nssmStrings.pause]
    
    @scala.inline
    def remove: typings.nssm.nssmStrings.remove = "remove".asInstanceOf[typings.nssm.nssmStrings.remove]
    
    @scala.inline
    def reset: typings.nssm.nssmStrings.reset = "reset".asInstanceOf[typings.nssm.nssmStrings.reset]
    
    @scala.inline
    def restart: typings.nssm.nssmStrings.restart = "restart".asInstanceOf[typings.nssm.nssmStrings.restart]
    
    @scala.inline
    def rotate: typings.nssm.nssmStrings.rotate = "rotate".asInstanceOf[typings.nssm.nssmStrings.rotate]
    
    @scala.inline
    def set: typings.nssm.nssmStrings.set = "set".asInstanceOf[typings.nssm.nssmStrings.set]
    
    @scala.inline
    def start: typings.nssm.nssmStrings.start = "start".asInstanceOf[typings.nssm.nssmStrings.start]
    
    @scala.inline
    def status: typings.nssm.nssmStrings.status = "status".asInstanceOf[typings.nssm.nssmStrings.status]
    
    @scala.inline
    def stop: typings.nssm.nssmStrings.stop = "stop".asInstanceOf[typings.nssm.nssmStrings.stop]
  }
  
  /* Inlined {[ key in nssm.nssm.Command ]: nssm.nssm.NssmCommandFn} */
  trait Nssm extends StObject {
    
    var continue: NssmCommandFn
    
    var get: NssmCommandFn
    
    var install: NssmCommandFn
    
    var pause: NssmCommandFn
    
    var remove: NssmCommandFn
    
    var reset: NssmCommandFn
    
    var restart: NssmCommandFn
    
    var rotate: NssmCommandFn
    
    var set: NssmCommandFn
    
    var start: NssmCommandFn
    
    var status: NssmCommandFn
    
    var stop: NssmCommandFn
  }
  object Nssm {
    
    @scala.inline
    def apply(
      continue: NssmCommandFn,
      get: NssmCommandFn,
      install: NssmCommandFn,
      pause: NssmCommandFn,
      remove: NssmCommandFn,
      reset: NssmCommandFn,
      restart: NssmCommandFn,
      rotate: NssmCommandFn,
      set: NssmCommandFn,
      start: NssmCommandFn,
      status: NssmCommandFn,
      stop: NssmCommandFn
    ): Nssm = {
      val __obj = js.Dynamic.literal(continue = continue.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], restart = restart.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nssm]
    }
    
    @scala.inline
    implicit class NssmMutableBuilder[Self <: Nssm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinue(value: NssmCommandFn): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: NssmCommandFn): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstall(value: NssmCommandFn): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: NssmCommandFn): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: NssmCommandFn): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: NssmCommandFn): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestart(value: NssmCommandFn): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: NssmCommandFn): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: NssmCommandFn): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: NssmCommandFn): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: NssmCommandFn): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: NssmCommandFn): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
  
  type NssmCatch[T] = js.Function1[
    /* onrejected */ js.UndefOr[
      (js.Function2[/* reason */ Error, /* stderr */ String, scala.Nothing | js.Thenable[scala.Nothing]]) | Null
    ], 
    NssmPromise[T | scala.Nothing]
  ]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.nssm.mod.PromiseCommandFn because Already inherited */ @js.native
  trait NssmCommandFn
    extends ZeroArgCommandFn
       with OneArgCommandFn
       with TwoArgCommandFn {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* arg1 */ String, arg2: /* arg2 */ String, arg3: /* callback */ CallbackFn): Unit = js.native
    /* InferMemberOverrides */
    override def apply(arg1: /* arg1 */ String, arg2: /* callback */ CallbackFn): Unit = js.native
    /* InferMemberOverrides */
    override def apply(arg1: /* callback */ CallbackFn): Unit = js.native
  }
  
  trait NssmOptions extends StObject {
    
    var nssmExe: js.UndefOr[String] = js.undefined
  }
  object NssmOptions {
    
    @scala.inline
    def apply(): NssmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NssmOptions]
    }
    
    @scala.inline
    implicit class NssmOptionsMutableBuilder[Self <: NssmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNssmExe(value: String): Self = StObject.set(x, "nssmExe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNssmExeUndefined: Self = StObject.set(x, "nssmExe", js.undefined)
    }
  }
  
  @js.native
  trait NssmPromise[T]
    extends js.Promise[T] {
    
    def `catch`[TResult](): NssmPromise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function2[/* reason */ Error, /* stderr */ String, TResult | js.Thenable[TResult]]): NssmPromise[T | TResult] = js.native
    @JSName("catch")
    var catch_Original: NssmCatch[T] = js.native
    
    def `then`[TResult1, TResult2](): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function2[/* reason */ Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
    ): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: Null,
      onrejected: js.Function2[/* reason */ Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
    ): NssmPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: Unit,
      onrejected: js.Function2[/* reason */ Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
    ): NssmPromise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: NssmThen[T] = js.native
  }
  
  type NssmThen[T] = js.Function2[
    /* onfulfilled */ js.UndefOr[(js.Function1[/* value */ T, T | js.Thenable[T]]) | Null], 
    /* onrejected */ js.UndefOr[
      (js.Function2[/* reason */ Error, /* stderr */ String, scala.Nothing | js.Thenable[scala.Nothing]]) | Null
    ], 
    NssmPromise[T | scala.Nothing]
  ]
  
  type OneArgCommandFn = js.Function2[/* arg1 */ String, /* callback */ CallbackFn, Unit]
  
  type PromiseCommandFn = js.Function2[/* arg1 */ js.UndefOr[String], /* arg2 */ js.UndefOr[String], NssmPromise[String]]
  
  type TwoArgCommandFn = js.Function3[/* arg1 */ String, /* arg2 */ String, /* callback */ CallbackFn, Unit]
  
  type ZeroArgCommandFn = js.Function1[/* callback */ CallbackFn, Unit]
}
