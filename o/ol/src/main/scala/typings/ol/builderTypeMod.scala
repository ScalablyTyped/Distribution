package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/canvas/BuilderType", JSImport.Namespace)
@js.native
object builderTypeMod extends js.Object {
  
  @js.native
  sealed trait BuilderType extends js.Object
  @js.native
  object BuilderType extends js.Object {
    
    @js.native
    sealed trait CIRCLE extends BuilderType
    
    @js.native
    sealed trait DEFAULT extends BuilderType
    
    @js.native
    sealed trait IMAGE extends BuilderType
    
    @js.native
    sealed trait LINE_STRING extends BuilderType
    
    @js.native
    sealed trait POLYGON extends BuilderType
    
    @js.native
    sealed trait TEXT extends BuilderType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BuilderType with String] = js.native
    
    /* "Circle" */ val CIRCLE: typings.ol.builderTypeMod.BuilderType.CIRCLE with String = js.native
    
    /* "Default" */ val DEFAULT: typings.ol.builderTypeMod.BuilderType.DEFAULT with String = js.native
    
    /* "Image" */ val IMAGE: typings.ol.builderTypeMod.BuilderType.IMAGE with String = js.native
    
    /* "LineString" */ val LINE_STRING: typings.ol.builderTypeMod.BuilderType.LINE_STRING with String = js.native
    
    /* "Polygon" */ val POLYGON: typings.ol.builderTypeMod.BuilderType.POLYGON with String = js.native
    
    /* "Text" */ val TEXT: typings.ol.builderTypeMod.BuilderType.TEXT with String = js.native
  }
}
