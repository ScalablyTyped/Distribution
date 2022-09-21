package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.formatTypeMod.FormatType
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.projMod.ProjectionLike
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureMod {
  
  @JSImport("ol/format/Feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/format/Feature", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with FeatureFormat
  
  inline def transformExtentWithOptions(extent: Extent): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("transformExtentWithOptions")(extent.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def transformExtentWithOptions(extent: Extent, opt_options: ReadOptions): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtentWithOptions")(extent.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def transformGeometryWithOptions(geometry: typings.ol.geometryMod.default, write: Boolean): typings.ol.geometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[typings.ol.geometryMod.default]
  inline def transformGeometryWithOptions(geometry: typings.ol.geometryMod.default, write: Boolean, opt_options: ReadOptions): typings.ol.geometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[typings.ol.geometryMod.default]
  inline def transformGeometryWithOptions(geometry: typings.ol.geometryMod.default, write: Boolean, opt_options: WriteOptions): typings.ol.geometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[typings.ol.geometryMod.default]
  
  @js.native
  trait FeatureFormat extends StObject {
    
    /**
      * Sets the dataProjection on the options, if no dataProjection
      * is set.
      */
    /* protected */ def adaptOptions(): js.UndefOr[WriteOptions | ReadOptions] = js.native
    /* protected */ def adaptOptions(options: ReadOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
    /* protected */ def adaptOptions(options: WriteOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
    
    /* protected */ var dataProjection: typings.ol.projectionMod.default = js.native
    
    /* protected */ var defaultFeatureProjection: typings.ol.projectionMod.default = js.native
    
    /* protected */ def getReadOptions(source: String): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: js.Object): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /**
      * Adds the data projection to the read options.
      */
    /* protected */ def getReadOptions(source: Document): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Document, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Element): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Element, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    
    def getType(): FormatType = js.native
    
    def readFeature(source: String): FeatureLike = js.native
    def readFeature(source: String, opt_options: ReadOptions): FeatureLike = js.native
    def readFeature(source: js.Object): FeatureLike = js.native
    def readFeature(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
    /**
      * Read a single feature from a source.
      */
    def readFeature(source: Document): FeatureLike = js.native
    def readFeature(source: Document, opt_options: ReadOptions): FeatureLike = js.native
    def readFeature(source: Element): FeatureLike = js.native
    def readFeature(source: Element, opt_options: ReadOptions): FeatureLike = js.native
    
    def readFeatures(source: String): js.Array[FeatureLike] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.Object): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.Object, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.typedarray.ArrayBuffer): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    /**
      * Read all features from a source.
      */
    def readFeatures(source: Document): js.Array[FeatureLike] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: Element): js.Array[FeatureLike] = js.native
    def readFeatures(source: Element, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    
    def readGeometry(source: String): typings.ol.geometryMod.default = js.native
    def readGeometry(source: String, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    def readGeometry(source: js.Object): typings.ol.geometryMod.default = js.native
    def readGeometry(source: js.Object, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    /**
      * Read a single geometry from a source.
      */
    def readGeometry(source: Document): typings.ol.geometryMod.default = js.native
    def readGeometry(source: Document, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    def readGeometry(source: Element): typings.ol.geometryMod.default = js.native
    def readGeometry(source: Element, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    
    def readProjection(source: String): typings.ol.projectionMod.default = js.native
    def readProjection(source: js.Object): typings.ol.projectionMod.default = js.native
    /**
      * Read the projection from a source.
      */
    def readProjection(source: Document): typings.ol.projectionMod.default = js.native
    def readProjection(source: Element): typings.ol.projectionMod.default = js.native
    
    /**
      * Encode a feature in this format.
      */
    def writeFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): String = js.native
    def writeFeature(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      opt_options: WriteOptions
    ): String = js.native
    
    /**
      * Encode an array of features in this format.
      */
    def writeFeatures(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): String = js.native
    def writeFeatures(
      features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): String = js.native
    
    /**
      * Write a single geometry in this format.
      */
    def writeGeometry(geometry: typings.ol.geometryMod.default): String = js.native
    def writeGeometry(geometry: typings.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
  }
  
  trait ReadOptions extends StObject {
    
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    extension [Self <: ReadOptions](x: Self) {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
    }
  }
  
  trait WriteOptions extends StObject {
    
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var decimals: js.UndefOr[Double] = js.undefined
    
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var rightHanded: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    extension [Self <: WriteOptions](x: Self) {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
      
      inline def setRightHanded(value: Boolean): Self = StObject.set(x, "rightHanded", value.asInstanceOf[js.Any])
      
      inline def setRightHandedUndefined: Self = StObject.set(x, "rightHanded", js.undefined)
    }
  }
}
