package typings.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ol.builderTypeMod.BuilderType
import typings.ol.canvasMod.DeclutterGroups
import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderGroupMod {
  
  @JSImport("ol/render/canvas/BuilderGroup", JSImport.Default)
  @js.native
  class default protected () extends BuilderGroup {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double, declutter: Boolean) = this()
  }
  
  @js.native
  trait BuilderGroup extends StObject {
    
    def addDeclutter(group: Boolean): DeclutterGroups = js.native
    
    def finish(): StringDictionary[typings.ol.olStrings.BuilderGroup with TopLevel[js.Any]] = js.native
    
    def getBuilder(zIndex: js.UndefOr[scala.Nothing], builderType: BuilderType): typings.ol.vectorContextMod.default = js.native
    def getBuilder(zIndex: Double, builderType: BuilderType): typings.ol.vectorContextMod.default = js.native
  }
}
