package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.sourceIiifMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatIiifinfoMod {
  
  /**
    * @classdesc
    * Format for transforming IIIF Image API image information responses into
    * IIIF tile source ready options
    *
    * @api
    */
  @JSImport("ol/format/IIIFInfo", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IIIFInfo {
    /**
      * @param {string|ImageInformationResponse} imageInfo
      * Deserialized image information JSON response object or JSON response as string
      */
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  object Versions {
    
    @JSImport("ol/format/IIIFInfo", "Versions.VERSION1")
    @js.native
    val VERSION1: String = js.native
    
    @JSImport("ol/format/IIIFInfo", "Versions.VERSION2")
    @js.native
    val VERSION2: String = js.native
    
    @JSImport("ol/format/IIIFInfo", "Versions.VERSION3")
    @js.native
    val VERSION3: String = js.native
  }
  type Versions = String
  
  /**
    * @classdesc
    * Format for transforming IIIF Image API image information responses into
    * IIIF tile source ready options
    *
    * @api
    */
  @js.native
  trait IIIFInfo extends StObject {
    
    /**
      * @param {Versions} version Optional IIIF image API version
      * @return {string} Compliance level as it appears in the IIIF image information
      * response.
      */
    def getComplianceLevelEntryFromProfile(version: Versions): String = js.native
    
    /**
      * @param {Versions} version Optional IIIF image API version
      * @return {string} Compliance level, on of 'level0', 'level1' or 'level2' or undefined
      */
    def getComplianceLevelFromProfile(version: Versions): String = js.native
    
    /**
      * @return {SupportedFeatures} Image formats, qualities and region / size calculation
      * methods that are supported by the IIIF service.
      */
    def getComplianceLevelSupportedFeatures(): SupportedFeatures = js.native
    
    /**
      * @return {Versions} Major IIIF version.
      * @api
      */
    def getImageApiVersion(): Versions = js.native
    
    /**
      * @param {PreferredOptions} [preferredOptions] Optional options for preferred format and quality.
      * @return {import("../source/IIIF.js").Options} IIIF tile source ready constructor options.
      * @api
      */
    def getTileSourceOptions(): Options = js.native
    def getTileSourceOptions(preferredOptions: PreferredOptions): Options = js.native
    
    var imageInfo: Any = js.native
    
    /**
      * @param {string|ImageInformationResponse} imageInfo
      * Deserialized image information JSON response object or JSON response as string
      * @api
      */
    def setImageInfo(imageInfo: String): Unit = js.native
    def setImageInfo(imageInfo: ImageInformationResponse): Unit = js.native
  }
  
  trait IiifProfile extends StObject {
    
    /**
      * Supported image formats for the image service.
      */
    var formats: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Maximum area (pixels) available for this image service.
      */
    var maxArea: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum height.
      */
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum width.
      */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Supported IIIF image qualities.
      */
    var qualities: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Supported features.
      */
    var supports: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IiifProfile {
    
    inline def apply(): IiifProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IiifProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IiifProfile] (val x: Self) extends AnyVal {
      
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
    String | Double | (js.Array[Double | String | IiifProfile | StringDictionary[Double] | TileInfo])
  ]
  
  trait PreferredOptions extends StObject {
    
    /**
      * Preferred image format. Will be used if the image information
      * indicates support for that format.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * IIIF image qualitiy.  Will be used if the image information
      * indicates support for that quality.
      */
    var quality: js.UndefOr[String] = js.undefined
  }
  object PreferredOptions {
    
    inline def apply(): PreferredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferredOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreferredOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  trait SupportedFeatures extends StObject {
    
    /**
      * Supported image formats.
      */
    var formats: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Supported IIIF image qualities.
      */
    var qualities: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Supported IIIF image size and region
      * calculation features.
      */
    var supports: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SupportedFeatures {
    
    inline def apply(): SupportedFeatures = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportedFeatures]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
      
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
    
    /**
      * Tile height in pixels. Same as tile width if height is
      * not given.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Supported resolution scaling factors.
      */
    var scaleFactors: js.Array[Double]
    
    /**
      * Tile width in pixels.
      */
    var width: Double
  }
  object TileInfo {
    
    inline def apply(scaleFactors: js.Array[Double], width: Double): TileInfo = {
      val __obj = js.Dynamic.literal(scaleFactors = scaleFactors.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileInfo] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScaleFactors(value: js.Array[Double]): Self = StObject.set(x, "scaleFactors", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorsVarargs(value: Double*): Self = StObject.set(x, "scaleFactors", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
