package typings.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ol.builderTypeMod.BuilderType
import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderGroupMod {
  
  @JSImport("ol/render/canvas/BuilderGroup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BuilderGroup {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait BuilderGroup extends StObject {
    
    def finish(): StringDictionary[typings.ol.olStrings.BuilderGroup & TopLevel[Any]] = js.native
    
    def getBuilder(zIndex: Double, builderType: BuilderType): typings.ol.vectorContextMod.default = js.native
    def getBuilder(zIndex: Unit, builderType: BuilderType): typings.ol.vectorContextMod.default = js.native
  }
}
