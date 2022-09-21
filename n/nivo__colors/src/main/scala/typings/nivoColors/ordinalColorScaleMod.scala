package typings.nivoColors

import typings.nivoColors.allMod.ColorSchemeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ordinalColorScaleMod {
  
  @JSImport("@nivo/colors/dist/types/scales/ordinalColorScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum]): OrdinalColorScale[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any]).asInstanceOf[OrdinalColorScale[Datum]]
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: String): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: DatumIdentityAccessor[Datum]): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  
  inline def useOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: String): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  inline def useOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: DatumIdentityAccessor[Datum]): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  
  type DatumIdentityAccessor[Datum] = js.Function1[/* datum */ Datum, String | Double]
  
  type OrdinalColorScale[Datum] = js.Function1[/* d */ Datum, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigStaticColor
    - typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigCustomFunction[Datum]
    - typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigScheme
    - typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigCustomColors
    - typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigDatumProperty
  */
  type OrdinalColorScaleConfig[Datum] = _OrdinalColorScaleConfig[Datum] | OrdinalColorScaleConfigStaticColor | OrdinalColorScaleConfigCustomFunction[Datum] | OrdinalColorScaleConfigCustomColors
  
  type OrdinalColorScaleConfigCustomColors = js.Array[String]
  
  type OrdinalColorScaleConfigCustomFunction[Datum] = js.Function1[/* d */ Datum, String]
  
  trait OrdinalColorScaleConfigDatumProperty
    extends StObject
       with _OrdinalColorScaleConfig[Any] {
    
    var datum: String
  }
  object OrdinalColorScaleConfigDatumProperty {
    
    inline def apply(datum: String): OrdinalColorScaleConfigDatumProperty = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrdinalColorScaleConfigDatumProperty]
    }
    
    extension [Self <: OrdinalColorScaleConfigDatumProperty](x: Self) {
      
      inline def setDatum(value: String): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrdinalColorScaleConfigScheme
    extends StObject
       with _OrdinalColorScaleConfig[Any] {
    
    var scheme: ColorSchemeId
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object OrdinalColorScaleConfigScheme {
    
    inline def apply(scheme: ColorSchemeId): OrdinalColorScaleConfigScheme = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrdinalColorScaleConfigScheme]
    }
    
    extension [Self <: OrdinalColorScaleConfigScheme](x: Self) {
      
      inline def setScheme(value: ColorSchemeId): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type OrdinalColorScaleConfigStaticColor = String
  
  trait _OrdinalColorScaleConfig[Datum] extends StObject
  object _OrdinalColorScaleConfig {
    
    inline def OrdinalColorScaleConfigDatumProperty(datum: String): typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigDatumProperty = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigDatumProperty]
    }
    
    inline def OrdinalColorScaleConfigScheme(scheme: ColorSchemeId): typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigScheme = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfigScheme]
    }
  }
}
