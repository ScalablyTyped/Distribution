package typings.playable

import typings.playable.anon.ConfigIPlayerConfig
import typings.playable.textMapTypesMod.ITextMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMapMod {
  
  @JSImport("playable/dist/src/modules/text-map/text-map", JSImport.Default)
  @js.native
  class default protected () extends TextMap {
    def this(hasConfig: ConfigIPlayerConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/text-map/text-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/text-map/text-map", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/text-map/text-map", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TextMap extends ITextMap {
    
    var _textMap: js.Any = js.native
  }
}
