package typings.playable

import typings.playable.anon.ConfigIPlayerConfig
import typings.playable.textMapTypesMod.ITextMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/text-map/text-map", JSImport.Namespace)
@js.native
object textMapMod extends js.Object {
  
  @js.native
  trait TextMap extends ITextMap {
    
    var _textMap: js.Any = js.native
  }
  
  @js.native
  class default protected () extends TextMap {
    def this(hasConfig: ConfigIPlayerConfig) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
