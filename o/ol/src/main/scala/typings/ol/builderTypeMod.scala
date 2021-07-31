package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderTypeMod {
  
  @JSImport("ol/render/canvas/BuilderType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BuilderType & String] = js.native
    
    /* "Circle" */ val CIRCLE: typings.ol.builderTypeMod.BuilderType.CIRCLE & String = js.native
    
    /* "Default" */ val DEFAULT: typings.ol.builderTypeMod.BuilderType.DEFAULT & String = js.native
    
    /* "Image" */ val IMAGE: typings.ol.builderTypeMod.BuilderType.IMAGE & String = js.native
    
    /* "LineString" */ val LINE_STRING: typings.ol.builderTypeMod.BuilderType.LINE_STRING & String = js.native
    
    /* "Polygon" */ val POLYGON: typings.ol.builderTypeMod.BuilderType.POLYGON & String = js.native
    
    /* "Text" */ val TEXT: typings.ol.builderTypeMod.BuilderType.TEXT & String = js.native
  }
  
  @js.native
  sealed trait BuilderType extends StObject
  @JSImport("ol/render/canvas/BuilderType", "BuilderType")
  @js.native
  object BuilderType extends StObject {
    
    @js.native
    sealed trait CIRCLE
      extends StObject
         with BuilderType
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with BuilderType
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with BuilderType
    
    @js.native
    sealed trait LINE_STRING
      extends StObject
         with BuilderType
    
    @js.native
    sealed trait POLYGON
      extends StObject
         with BuilderType
    
    @js.native
    sealed trait TEXT
      extends StObject
         with BuilderType
  }
}
