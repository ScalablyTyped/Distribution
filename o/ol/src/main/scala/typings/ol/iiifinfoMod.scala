package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.iiifMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iiifinfoMod {
  
  @JSImport("ol/format/IIIFInfo", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IIIFInfo {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @js.native
  sealed trait Versions extends StObject
  @JSImport("ol/format/IIIFInfo", "Versions")
  @js.native
  object Versions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Versions & String] = js.native
    
    @js.native
    sealed trait VERSION1
      extends StObject
         with Versions
    /* "version1" */ val VERSION1: typings.ol.iiifinfoMod.Versions.VERSION1 & String = js.native
    
    @js.native
    sealed trait VERSION2
      extends StObject
         with Versions
    /* "version2" */ val VERSION2: typings.ol.iiifinfoMod.Versions.VERSION2 & String = js.native
    
    @js.native
    sealed trait VERSION3
      extends StObject
         with Versions
    /* "version3" */ val VERSION3: typings.ol.iiifinfoMod.Versions.VERSION3 & String = js.native
  }
  
  @js.native
  trait IIIFInfo extends StObject {
    
    def getComplianceLevelEntryFromProfile(version: Versions): String = js.native
    
    def getComplianceLevelFromProfile(version: Versions): String = js.native
    
    def getComplianceLevelSupportedFeatures(): SupportedFeatures = js.native
    
    def getImageApiVersion(): Versions = js.native
    
    def getTileSourceOptions(): Options = js.native
    def getTileSourceOptions(opt_preferredOptions: PreferredOptions): Options = js.native
    
    def setImageInfo(imageInfo: String): Unit = js.native
    def setImageInfo(imageInfo: ImageInformationResponse): Unit = js.native
  }
  
  trait IiifProfile extends StObject {
    
    var formats: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxArea: js.UndefOr[Double] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var qualities: js.UndefOr[js.Array[String]] = js.undefined
    
    var supports: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IiifProfile {
    
    inline def apply(): IiifProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IiifProfile]
    }
    
    extension [Self <: IiifProfile](x: Self) {
      
      inline def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setMaxArea(value: Double): Self = StObject.set(x, "maxArea", value.asInstanceOf[js.Any])
      
      inline def setMaxAreaUndefined: Self = StObject.set(x, "maxArea", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setQualities(value: js.Array[String]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
      
      inline def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
      
      inline def setQualitiesVarargs(value: String*): Self = StObject.set(x, "qualities", js.Array(value*))
      
      inline def setSupports(value: js.Array[String]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
      
      inline def setSupportsVarargs(value: String*): Self = StObject.set(x, "supports", js.Array(value*))
    }
  }
  
  type ImageInformationResponse = StringDictionary[
    String | Double | (js.Array[Double | String | IiifProfile]) | StringDictionary[Double] | TileInfo
  ]
  
  trait PreferredOptions extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[String] = js.undefined
  }
  object PreferredOptions {
    
    inline def apply(): PreferredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferredOptions]
    }
    
    extension [Self <: PreferredOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  trait SupportedFeatures extends StObject {
    
    var formats: js.UndefOr[js.Array[String]] = js.undefined
    
    var qualities: js.UndefOr[js.Array[String]] = js.undefined
    
    var supports: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SupportedFeatures {
    
    inline def apply(): SupportedFeatures = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportedFeatures]
    }
    
    extension [Self <: SupportedFeatures](x: Self) {
      
      inline def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setQualities(value: js.Array[String]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
      
      inline def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
      
      inline def setQualitiesVarargs(value: String*): Self = StObject.set(x, "qualities", js.Array(value*))
      
      inline def setSupports(value: js.Array[String]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
      
      inline def setSupportsVarargs(value: String*): Self = StObject.set(x, "supports", js.Array(value*))
    }
  }
  
  trait TileInfo extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var scaleFactors: js.Array[Double]
    
    var width: Double
  }
  object TileInfo {
    
    inline def apply(scaleFactors: js.Array[Double], width: Double): TileInfo = {
      val __obj = js.Dynamic.literal(scaleFactors = scaleFactors.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileInfo]
    }
    
    extension [Self <: TileInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScaleFactors(value: js.Array[Double]): Self = StObject.set(x, "scaleFactors", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorsVarargs(value: Double*): Self = StObject.set(x, "scaleFactors", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
