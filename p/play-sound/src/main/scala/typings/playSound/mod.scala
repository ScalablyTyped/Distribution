package typings.playSound

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecException
import typings.playSound.anon.PartialPlayOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Play = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Play]
  inline def apply(opts: PartialPlayOpts): Play = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Play]
  
  @JSImport("play-sound", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Play extends StObject {
    
    def play(what: String): ChildProcess = js.native
    def play(what: String, next: js.Function1[/* err */ ExecException, Unit]): ChildProcess = js.native
    def play(what: String, options: Unit, next: js.Function1[/* err */ ExecException, Unit]): ChildProcess = js.native
    def play(what: String, options: PlayMethodOptions): ChildProcess = js.native
    def play(what: String, options: PlayMethodOptions, next: js.Function1[/* err */ ExecException, Unit]): ChildProcess = js.native
    
    var player: Any = js.native
    
    var players: js.Array[Players] = js.native
    
    def test(): ChildProcess = js.native
    def test(next: js.Function1[/* err */ ExecException, Unit]): ChildProcess = js.native
    
    var urlRegex: js.RegExp = js.native
  }
  
  /* Inlined std.Partial<{[ key in play-sound.play-sound.Players ]: std.Array<string | number>} & {  timeout :number}> */
  trait PlayMethodOptions extends StObject {
    
    var afplay: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var aplay: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var cmdmp3: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var mpg123: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var mpg321: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var mplayer: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var omxplayer: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var play: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PlayMethodOptions {
    
    inline def apply(): PlayMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayMethodOptions]
    }
    
    extension [Self <: PlayMethodOptions](x: Self) {
      
      inline def setAfplay(value: js.Array[String | Double]): Self = StObject.set(x, "afplay", value.asInstanceOf[js.Any])
      
      inline def setAfplayUndefined: Self = StObject.set(x, "afplay", js.undefined)
      
      inline def setAfplayVarargs(value: (String | Double)*): Self = StObject.set(x, "afplay", js.Array(value*))
      
      inline def setAplay(value: js.Array[String | Double]): Self = StObject.set(x, "aplay", value.asInstanceOf[js.Any])
      
      inline def setAplayUndefined: Self = StObject.set(x, "aplay", js.undefined)
      
      inline def setAplayVarargs(value: (String | Double)*): Self = StObject.set(x, "aplay", js.Array(value*))
      
      inline def setCmdmp3(value: js.Array[String | Double]): Self = StObject.set(x, "cmdmp3", value.asInstanceOf[js.Any])
      
      inline def setCmdmp3Undefined: Self = StObject.set(x, "cmdmp3", js.undefined)
      
      inline def setCmdmp3Varargs(value: (String | Double)*): Self = StObject.set(x, "cmdmp3", js.Array(value*))
      
      inline def setMpg123(value: js.Array[String | Double]): Self = StObject.set(x, "mpg123", value.asInstanceOf[js.Any])
      
      inline def setMpg123Undefined: Self = StObject.set(x, "mpg123", js.undefined)
      
      inline def setMpg123Varargs(value: (String | Double)*): Self = StObject.set(x, "mpg123", js.Array(value*))
      
      inline def setMpg321(value: js.Array[String | Double]): Self = StObject.set(x, "mpg321", value.asInstanceOf[js.Any])
      
      inline def setMpg321Undefined: Self = StObject.set(x, "mpg321", js.undefined)
      
      inline def setMpg321Varargs(value: (String | Double)*): Self = StObject.set(x, "mpg321", js.Array(value*))
      
      inline def setMplayer(value: js.Array[String | Double]): Self = StObject.set(x, "mplayer", value.asInstanceOf[js.Any])
      
      inline def setMplayerUndefined: Self = StObject.set(x, "mplayer", js.undefined)
      
      inline def setMplayerVarargs(value: (String | Double)*): Self = StObject.set(x, "mplayer", js.Array(value*))
      
      inline def setOmxplayer(value: js.Array[String | Double]): Self = StObject.set(x, "omxplayer", value.asInstanceOf[js.Any])
      
      inline def setOmxplayerUndefined: Self = StObject.set(x, "omxplayer", js.undefined)
      
      inline def setOmxplayerVarargs(value: (String | Double)*): Self = StObject.set(x, "omxplayer", js.Array(value*))
      
      inline def setPlay(value: js.Array[String | Double]): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPlayVarargs(value: (String | Double)*): Self = StObject.set(x, "play", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait PlayOpts extends StObject {
    
    var player: Players
    
    var players: js.Array[Players]
  }
  object PlayOpts {
    
    inline def apply(player: Players, players: js.Array[Players]): PlayOpts = {
      val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayOpts]
    }
    
    extension [Self <: PlayOpts](x: Self) {
      
      inline def setPlayer(value: Players): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
      
      inline def setPlayers(value: js.Array[Players]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setPlayersVarargs(value: Players*): Self = StObject.set(x, "players", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.playSound.playSoundStrings.mplayer
    - typings.playSound.playSoundStrings.afplay
    - typings.playSound.playSoundStrings.mpg123
    - typings.playSound.playSoundStrings.mpg321
    - typings.playSound.playSoundStrings.play
    - typings.playSound.playSoundStrings.omxplayer
    - typings.playSound.playSoundStrings.aplay
    - typings.playSound.playSoundStrings.cmdmp3
  */
  trait Players extends StObject
  object Players {
    
    inline def afplay: typings.playSound.playSoundStrings.afplay = "afplay".asInstanceOf[typings.playSound.playSoundStrings.afplay]
    
    inline def aplay: typings.playSound.playSoundStrings.aplay = "aplay".asInstanceOf[typings.playSound.playSoundStrings.aplay]
    
    inline def cmdmp3: typings.playSound.playSoundStrings.cmdmp3 = "cmdmp3".asInstanceOf[typings.playSound.playSoundStrings.cmdmp3]
    
    inline def mpg123: typings.playSound.playSoundStrings.mpg123 = "mpg123".asInstanceOf[typings.playSound.playSoundStrings.mpg123]
    
    inline def mpg321: typings.playSound.playSoundStrings.mpg321 = "mpg321".asInstanceOf[typings.playSound.playSoundStrings.mpg321]
    
    inline def mplayer: typings.playSound.playSoundStrings.mplayer = "mplayer".asInstanceOf[typings.playSound.playSoundStrings.mplayer]
    
    inline def omxplayer: typings.playSound.playSoundStrings.omxplayer = "omxplayer".asInstanceOf[typings.playSound.playSoundStrings.omxplayer]
    
    inline def play: typings.playSound.playSoundStrings.play = "play".asInstanceOf[typings.playSound.playSoundStrings.play]
  }
}
