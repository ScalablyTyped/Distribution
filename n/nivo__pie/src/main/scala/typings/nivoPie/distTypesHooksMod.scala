package typings.nivoPie

import typings.nivoPie.anon.ActiveId
import typings.nivoPie.anon.ArcGenerator
import typings.nivoPie.anon.CenterX
import typings.nivoPie.anon.Data
import typings.nivoPie.anon.DataArray
import typings.nivoPie.anon.DataWithArc
import typings.nivoPie.anon.InnerRadius
import typings.nivoPie.distTypesTypesMod.CompletePieSvgProps
import typings.nivoPie.distTypesTypesMod.ComputedDatum
import typings.nivoPie.distTypesTypesMod.PieCustomLayerProps
import typings.nivoPie.nivoPieStrings.activeInnerRadiusOffset
import typings.nivoPie.nivoPieStrings.activeOuterRadiusOffset
import typings.nivoPie.nivoPieStrings.arc
import typings.nivoPie.nivoPieStrings.colors
import typings.nivoPie.nivoPieStrings.cornerRadius
import typings.nivoPie.nivoPieStrings.endAngle
import typings.nivoPie.nivoPieStrings.fill
import typings.nivoPie.nivoPieStrings.fit
import typings.nivoPie.nivoPieStrings.height
import typings.nivoPie.nivoPieStrings.id
import typings.nivoPie.nivoPieStrings.innerRadius
import typings.nivoPie.nivoPieStrings.padAngle
import typings.nivoPie.nivoPieStrings.sortByValue
import typings.nivoPie.nivoPieStrings.startAngle
import typings.nivoPie.nivoPieStrings.value
import typings.nivoPie.nivoPieStrings.valueFormat
import typings.nivoPie.nivoPieStrings.width
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/pie/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useNormalizedData[RawDatum /* <: MayHaveLabel */](param0: (Pick[CompletePieSvgProps[RawDatum], id | value | valueFormat | colors]) & Data[RawDatum]): js.Array[Omit[ComputedDatum[RawDatum], fill | arc]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNormalizedData")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]]
  
  inline def usePie[RawDatum](
    param0: (Pick[
      Partial[CompletePieSvgProps[RawDatum]], 
      startAngle | endAngle | sortByValue | padAngle | cornerRadius | activeInnerRadiusOffset | activeOuterRadiusOffset
    ]) & InnerRadius[RawDatum]
  ): ArcGenerator[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePie")(param0.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator[RawDatum]]
  
  inline def usePieArcs[RawDatum](param0: ActiveId[RawDatum]): DataWithArc[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieArcs")(param0.asInstanceOf[js.Any]).asInstanceOf[DataWithArc[RawDatum]]
  
  inline def usePieFromBox[RawDatum](
    param0: (Pick[
      CompletePieSvgProps[RawDatum], 
      startAngle | endAngle | innerRadius | width | height | sortByValue | padAngle | cornerRadius | fit | activeInnerRadiusOffset | activeOuterRadiusOffset
    ]) & DataArray[RawDatum]
  ): CenterX[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieFromBox")(param0.asInstanceOf[js.Any]).asInstanceOf[CenterX[RawDatum]]
  
  inline def usePieLayerContext[RawDatum](param0: PieCustomLayerProps[RawDatum]): PieCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieLayerContext")(param0.asInstanceOf[js.Any]).asInstanceOf[PieCustomLayerProps[RawDatum]]
  
  trait MayHaveLabel extends StObject {
    
    var label: js.UndefOr[String | Double] = js.undefined
  }
  object MayHaveLabel {
    
    inline def apply(): MayHaveLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MayHaveLabel]
    }
    
    extension [Self <: MayHaveLabel](x: Self) {
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
