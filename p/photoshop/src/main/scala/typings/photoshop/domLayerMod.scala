package typings.photoshop

import typings.photoshop.anon.Interpolation
import typings.photoshop.anon.X
import typings.photoshop.domCollectionsLayersMod.Layers
import typings.photoshop.domConstantsMod.AnchorPosition
import typings.photoshop.domConstantsMod.BlendMode
import typings.photoshop.domConstantsMod.CreateFields
import typings.photoshop.domConstantsMod.DepthMapSource
import typings.photoshop.domConstantsMod.DisplacementMapType
import typings.photoshop.domConstantsMod.ElementPlacement
import typings.photoshop.domConstantsMod.EliminateFields
import typings.photoshop.domConstantsMod.Geometry
import typings.photoshop.domConstantsMod.LayerKind
import typings.photoshop.domConstantsMod.LensType
import typings.photoshop.domConstantsMod.NoiseDistribution
import typings.photoshop.domConstantsMod.OffsetUndefinedAreas
import typings.photoshop.domConstantsMod.PolarConversionType
import typings.photoshop.domConstantsMod.PreserveShape
import typings.photoshop.domConstantsMod.RasterizeType
import typings.photoshop.domConstantsMod.RippleSize
import typings.photoshop.domConstantsMod.SmartBlurMode
import typings.photoshop.domConstantsMod.SmartBlurQuality
import typings.photoshop.domConstantsMod.SpherizeMode
import typings.photoshop.domConstantsMod.TextureType
import typings.photoshop.domConstantsMod.UndefinedAreas
import typings.photoshop.domConstantsMod.WaveType
import typings.photoshop.domConstantsMod.ZigZagType
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domObjectsBoundsMod.Bounds
import typings.photoshop.domTextItemMod.TextItem
import typings.photoshop.domTypesApplyImageTypesMod.ApplyImageLayerType
import typings.photoshop.domTypesApplyImageTypesMod.ApplyImageOptions
import typings.photoshop.domTypesCalculationsTypesMod.CalculationsLayerType
import typings.photoshop.photoshopStrings.both
import typings.photoshop.photoshopStrings.horizontal
import typings.photoshop.photoshopStrings.vertical
import typings.photoshop.utilUnitMod.AngleValue
import typings.photoshop.utilUnitMod.PercentValue
import typings.photoshop.utilUnitMod.PixelValue
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domLayerMod {
  
  @JSImport("photoshop/dom/Layer", "Layer")
  @js.native
  open class Layer protected ()
    extends StObject
       with ApplyImageLayerType
       with CalculationsLayerType {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * @ignore
      * We use ID to reference the layer's document internally
      */
    val _docId: Double = js.native
    
    /**
      * @ignore
      * We use ID to reference layers internally
      */
    /* private */ val _id: Any = js.native
    
    /**
      * When set to true, prevents edits to pixels and properties of this layer.
      * @minVersion 22.5
      */
    def allLocked: Boolean = js.native
    def allLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * Applies the Add Noise filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param amount Percentage of noise applied [0.1,400].
      * @param distribution Distribution method to use.
      * @param monochromatic Adds black and white noise if true.
      * @async
      */
    def applyAddNoise(amount: Double, distribution: NoiseDistribution, monochromatic: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Applies the Average filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @async
      */
    def applyAverage(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Blur filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @async
      */
    def applyBlur(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Blur More filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @async
      */
    def applyBlurMore(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Clouds filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @async
      */
    def applyClouds(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Custom filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param characteristics Square matrix (5 x 5) used to perform filter operation.
      * @param scale The value by which to divide the sum of the pixel values included in the calculation
      * @param offset The value to be added to the result of the scale calculation.
      * @async
      */
    def applyCustomFilter(characteristics: js.Array[Double], scale: Double, offset: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the De-Interlace filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap, CMYK 8 bits, CMYK 16 bits, Duotone 8 bits
      *
      * @minVersion 23.5
      * @param eliminateFields Eliminate EVENFIELDS or ODDFIELDS field order.
      * @param createFields Create fields by either DUPLICATION or INTERPOLATION.
      * @async
      */
    def applyDeInterlace(eliminateFields: EliminateFields, createFields: CreateFields): js.Promise[Unit] = js.native
    
    /**
      * Applies the Despeckle filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap, RGB 32 bits, Grayscale 32 bits
      *
      * @minVersion 23.5
      * @async
      */
    def applyDespeckle(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Difference Clouds filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap, Lab 8 bits, Lab 16 bits
      *
      * @minVersion 23.5
      * @async
      */
    def applyDifferenceClouds(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Diffuse Glow filter.
      *
      * Supported color modes: RGB 8 bits, Duotone 8 bits, Grayscale 8 bits, Multichannel 8 bits
      *
      * @minVersion 23.5
      * @param graininess The amount of grain [0,10].
      * @param glowAmount The glow amount [0,20].
      * @param clearAmount The clear amount [0,20].
      * @async
      */
    def applyDiffuseGlow(graininess: Double, glowAmount: Double, clearAmount: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Displace filter using the specified horizontal
      * and vertical scale, mapping type, treatment of undistorted
      * areas, and path to the distortion image map.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param horizontalScale How much to scale in the direction of width [-999,999].
      * @param verticalScale How much to scale in the direction of height [-999,999].
      * @param displacementType Describes how the displacement map fits the
      * image if the image is not the same size as the map.
      * @param undefinedAreas The method used to treat undistorted areas
      * or areas left blank in an image to which the filter in the Distor
      * category has been applied.
      * @param displacementMapFile Path to the distortion image map.
      * @async
      */
    def applyDisplace(
      horizontalScale: Double,
      verticalScale: Double,
      displacementType: DisplacementMapType,
      undefinedAreas: UndefinedAreas,
      displacementMapFile: File
    ): js.Promise[Unit] = js.native
    
    /**
      * Applies the Dust & Scratches filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap, RGB 32 bits, Grayscale 32 bits
      *
      * @minVersion 23.5
      * @param radius The radius of the filter in pixels [1,100].
      * @param threshold The lower the amount, the stronger the effect [0,255].
      * @async
      */
    def applyDustAndScratches(radius: Double, threshold: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Gaussian Blur filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param radius The radius of the filter in pixels [0.1,250].
      * @async
      */
    def applyGaussianBlur(radius: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Glass filter.
      *
      * Supported color modes: RGB 8 bits, Duotone 8 bits, Grayscale 8 bits, Multichannel 8 bits
      *
      * @minVersion 23.5
      * @param distortion Change the amount the glass distorts the image [0,20].
      * @param smoothness Change the smoothness of the glass [1,15].
      * @param scaling The percentage value to scale by [50,200].
      * @param invert Invert the glass (default: false).
      * @param texture The type of glass texture.
      * This argument is ignored if "textureFile" is provided. (default: TextureType.CANVAS)
      * @param textureFile Mapping for glass distortion (optional).
      * @async
      */
    def applyGlassEffect(distortion: Double, smoothness: Double, scaling: Double): js.Promise[Unit] = js.native
    def applyGlassEffect(distortion: Double, smoothness: Double, scaling: Double, invert: Boolean): js.Promise[Unit] = js.native
    def applyGlassEffect(
      distortion: Double,
      smoothness: Double,
      scaling: Double,
      invert: Boolean,
      texture: Unit,
      textureFile: File
    ): js.Promise[Unit] = js.native
    def applyGlassEffect(distortion: Double, smoothness: Double, scaling: Double, invert: Boolean, texture: TextureType): js.Promise[Unit] = js.native
    def applyGlassEffect(
      distortion: Double,
      smoothness: Double,
      scaling: Double,
      invert: Boolean,
      texture: TextureType,
      textureFile: File
    ): js.Promise[Unit] = js.native
    def applyGlassEffect(
      distortion: Double,
      smoothness: Double,
      scaling: Double,
      invert: Unit,
      texture: Unit,
      textureFile: File
    ): js.Promise[Unit] = js.native
    def applyGlassEffect(distortion: Double, smoothness: Double, scaling: Double, invert: Unit, texture: TextureType): js.Promise[Unit] = js.native
    def applyGlassEffect(
      distortion: Double,
      smoothness: Double,
      scaling: Double,
      invert: Unit,
      texture: TextureType,
      textureFile: File
    ): js.Promise[Unit] = js.native
    
    /**
      * Applies the High Pass filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param radius The width of high pass filter (pixels) [0.1,1000].
      * @async
      */
    def applyHighPass(radius: Double): js.Promise[Unit] = js.native
    
    /**
      * The applyImage method lets you blend one image’s layer and channel (the source) with a this layer (the target).
      * This will change pixels contained in this layer.
      * Performs Image > Apply Image on the document. See the ApplyImageOptions
      * object for more info and examples.
      * @param applyImageOptions Option object for applyImage.
      * @async
      * @minVersion 24.5
      */
    def applyImage(applyImageOptions: ApplyImageOptions): js.Promise[Unit] = js.native
    
    /**
      * Applies the Lens Blur filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap, RGB 32 bits, Grayscale 32 bits
      *
      * @minVersion 23.5
      * @param source The source for the depth map (default: `DepthMapSource.NONE`)
      * @param focalDistance The blur focal distance for the depth map [0,255] (default: `0`).
      * @param invertDepthMask True if the depth map is inverted (default: `false`)
      * @param shape The shape of the iris (default: `Geometry.HEXAGON`)
      * @param radius The radius of the iris [0,100] (default: 15)
      * @param bladeCurvature The blade curvature of the iris [0,100] (default: `0`)
      * @param rotation The rotation of the iris [0,360] (default: `0`)
      * @param brightness The brightness for the specular highlights [0,100] (default: `0`)
      * @param threshold The threshold for the specular highlights [0,255] (default: `0`)
      * @param amount The amount of noise [0,100] (default: `0`)
      * @param distribution The distribution value for the noise (default: `NoiseDistribution.UNIFORM`)
      * @param monochromatic True if the noise is monochromatic (default: `false`)
      * @async
      */
    def applyLensBlur(
      source: js.UndefOr[DepthMapSource],
      focalDistance: js.UndefOr[Double],
      invertDepthMask: js.UndefOr[Boolean],
      shape: js.UndefOr[Geometry],
      radius: js.UndefOr[Double],
      bladeCurvature: js.UndefOr[Double],
      rotation: js.UndefOr[Double],
      brightness: js.UndefOr[Double],
      threshold: js.UndefOr[Double],
      amount: js.UndefOr[Double],
      distribution: js.UndefOr[NoiseDistribution],
      monochromatic: js.UndefOr[Boolean]
    ): js.Promise[Unit] = js.native
    
    /**
      * Applies the Lens Flare filter.
      *
      * Supported color modes: RGB 8 bits, RGB 16 bits, RGB 32 bits
      *
      * @minVersion 23.5
      * @param brightness Percentage of brightness applied [10,300].
      * @param flareCenter The flare center `{x: number, y: number}`.
      * @param flareCenter.x The horizontal coordinate in pixels.
      * @param flareCenter.y The vertical coordinate in pixels.
      * @param lensType The lens type used to produce the effect (default: `LensType.ZOOMLENS`).
      * @async
      */
    def applyLensFlare(brightness: Double, flareCenter: X): js.Promise[Unit] = js.native
    def applyLensFlare(brightness: Double, flareCenter: X, lensType: LensType): js.Promise[Unit] = js.native
    
    /**
      * Applies the Maximum filter
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param radius The radius of the filter in pixels.<br/>
      *               Integer in the range [1,500] when using `SQUARENESS`.<br/>
      *               Float in the range [0.2,500] when using `ROUNDNESS`.<br/>
      * @param preserveShape Favor hard corners or smooth curves around the edges<br/>
      *                      (default: `PreserveShape.SQUARENESS`)
      */
    def applyMaximum(radius: Double): js.Promise[Unit] = js.native
    def applyMaximum(radius: Double, preserveShape: PreserveShape): js.Promise[Unit] = js.native
    
    /**
      * Applies the Median filter
      *
      * Unsupported color modes: Indexed Color, Bitmap, RGB 32 bits, Grayscale 32 bits
      *
      * @minVersion 23.5
      * @param radius The radius of the filter in pixels [1,500]
      */
    def applyMedianNoise(radius: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Minimum filter
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param radius The radius of the filter in pixels.<br/>
      *               Integer in the range [1,500] when using `SQUARENESS`.<br/>
      *               Float in the range [0.2,500] when using `ROUNDNESS`.<br/>
      * @param preserveShape Favor hard corners or smooth curves around the edges<br/>
      *                      (default: `PreserveShape.SQUARENESS`)
      */
    def applyMinimum(radius: Double): js.Promise[Unit] = js.native
    def applyMinimum(radius: Double, preserveShape: PreserveShape): js.Promise[Unit] = js.native
    
    /**
      * Applies the Motion Blur filter
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param angle The angle the blur effect will be applied at (degrees) [-360,360]
      * @param distance The amount of blur [1,2000]
      */
    def applyMotionBlur(angle: Double, distance: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the NTSC Colors filter
      *
      * Supported color modes: RGB 8 bits, RGB 16 bits, RGB 32 bits
      *
      * @minVersion 23.5
      */
    def applyNTSC(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Ocean Ripple filter
      *
      * Supported color modes: RGB 8 bits, Duotone 8 bits, Grayscale 8 bits, Multichannel 8 bits
      *
      * @minVersion 23.5
      * @param size The Ripple size [1,15]
      * @param magnitude The Ripple magnitude [1,20]
      */
    def applyOceanRipple(size: Double, magnitude: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Offset filter
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param horizontal The horizontal offset [-2 \* doc.width, 2 \* doc.width]
      * @param vertical The vertical offset [-2 \* doc.height, 2 \* doc.height]
      * @param undefinedAreas Method to use to fill the empty space left by the offset<br/>
      *                       (default: `OffsetUndefinedAreas.WRAPAROUND`).
      */
    def applyOffset(horizontal: Double, vertical: Double): js.Promise[Unit] = js.native
    def applyOffset(horizontal: Double, vertical: Double, undefinedAreas: OffsetUndefinedAreas): js.Promise[Unit] = js.native
    
    /**
      * Applies the Pinch filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param amount The pinch amount. Negative value creates effect of expansion
      * and positive creates effect of contraction. [-100,100]
      * @async
      */
    def applyPinch(amount: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Polar Coordinates filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param conversion The conversion type.
      * @async
      */
    def applyPolarCoordinates(conversion: PolarConversionType): js.Promise[Unit] = js.native
    
    /**
      * Applies the Ripple filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param amount The ripple amount. [-999,999]
      * @param size The ripple size.
      * @async
      */
    def applyRipple(amount: Double, size: RippleSize): js.Promise[Unit] = js.native
    
    /**
      * Applies the Sharpen filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @async
      */
    def applySharpen(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Sharpen Edges filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap, RGB 32 bits, Grayscale 32 bits
      *
      * @minVersion 23.5
      * @async
      */
    def applySharpenEdges(): js.Promise[Unit] = js.native
    
    /**
      * Applies the Sharpen More filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @async
      */
    def applySharpenMore(): js.Promise[Unit] = js.native
    
    /**
      * Applies the the Shear filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param curve Specification of the shear curve in points as coordinates object with x, y properties
      * e.g.in the format [{x:-20, y:1}, {x:30, y:128}]. Any number higher than 2 of coordinate objects can be specified.
      * For "x" coordinate it is recommended to use range [-63,64] and for "y" coordinate use range [1,128].
      * For bests results please make sure that first point has 0 at "y" axis and last point has 128 at "y" axis.
      * Also sort points by "y" value in ascending order. Follow these rules to ensure that curve will be shown correctly
      * in dialog UI.
      * @param undefinedArea The treatment of areas left blank by the distortion.
      * @async
      */
    def applyShear(curve: js.Array[X], undefinedArea: UndefinedAreas): js.Promise[Unit] = js.native
    
    /**
      * Applies the Smart Blur filter.
      *
      * Supported color modes: RGB 8 bits, CMYK 8 bits, Duotone 8 bits,
      *
      * Grayscale 8 bits, Lab 8 bits, Multichannel 8 bits
      * @param radius The blur radius [0.1,100].
      * @param threshold The blur threshold [0.1,100].
      * @param blurQuality The smoothness or graininess of the blurred image.
      * @param mode The smart blur mode.
      * @async
      * @minVersion 24.0
      */
    def applySmartBlur(radius: Double, threshold: Double, blurQuality: SmartBlurQuality, mode: SmartBlurMode): js.Promise[Unit] = js.native
    
    /**
      * Applies the Spherize filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @param amount The amount of distortion [-100,100].
      * @param mode The distortion mode.
      * @async
      * @minVersion 24.0
      */
    def applySpherize(amount: Double, mode: SpherizeMode): js.Promise[Unit] = js.native
    
    /**
      * Applies the Twirl filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @minVersion 23.5
      * @param angle The amount of twirl to apply (degrees) [-999,999]
      * @async
      */
    def applyTwirl(angle: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Unsharp Mask filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @param amount The amount of sharpening (as a whole number percentage) [1,500].
      * @param radius The radius in pixels [0.1,1000].
      * @param threshold The contrast threshold [0,255].
      * @async
      * @minVersion 24.0
      */
    def applyUnSharpMask(amount: Double, radius: Double, threshold: Double): js.Promise[Unit] = js.native
    
    /**
      * Applies the Wave filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @param generatorNumber The whole number of generators [1,999].
      * @param minimumWavelength The minimum wave length [1,(maximum wave length - 1)] (whole number).
      * @param maximumWavelength The maximum wave length [(minimum wave length + 1),999] (whole number).
      * @param minimumAmplitude The minimum amplitude [1,(maximum amplitude - 1)] (whole number).
      * @param maximumAmplitude The maximum amplitude [(minimum amplitude + 1),999] (whole number).
      * @param horizontalScale The amount of horizontal scale (as a percentage) [1,100] (whole number).
      * @param verticalScale The amount of vertical scale (as a percentage) [1,100] (whole number).
      * @param waveType The wave type (optional).
      * @param undefinedAreas The treatment of areas left blank by the distortion (optional).
      * @param randomSeed The random seed (optional).
      * @async
      * @minVersion 24.0
      */
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double
    ): js.Promise[Unit] = js.native
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double,
      waveType: Unit,
      undefinedAreas: Unit,
      randomSeed: Double
    ): js.Promise[Unit] = js.native
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double,
      waveType: Unit,
      undefinedAreas: UndefinedAreas
    ): js.Promise[Unit] = js.native
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double,
      waveType: Unit,
      undefinedAreas: UndefinedAreas,
      randomSeed: Double
    ): js.Promise[Unit] = js.native
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double,
      waveType: WaveType
    ): js.Promise[Unit] = js.native
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double,
      waveType: WaveType,
      undefinedAreas: Unit,
      randomSeed: Double
    ): js.Promise[Unit] = js.native
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double,
      waveType: WaveType,
      undefinedAreas: UndefinedAreas
    ): js.Promise[Unit] = js.native
    def applyWave(
      generatorNumber: Double,
      minimumWavelength: Double,
      maximumWavelength: Double,
      minimumAmplitude: Double,
      maximumAmplitude: Double,
      horizontalScale: Double,
      verticalScale: Double,
      waveType: WaveType,
      undefinedAreas: UndefinedAreas,
      randomSeed: Double
    ): js.Promise[Unit] = js.native
    
    /**
      * Applies the ZigZag filter.
      *
      * Unsupported color modes: Indexed Color, Bitmap
      *
      * @param amount The amount of zigzag [-100,100].
      * @param ridges The number of ridges [0,20].
      * @param style The zigzag style.
      * @async
      * @minVersion 24.0
      */
    def applyZigZag(amount: Double, ridges: Double, style: ZigZagType): js.Promise[Unit] = js.native
    
    /**
      * The blend mode of the layer.
      *
      * ***Fixes in Photoshop 24.2:***
      * - *Now it will throw error when passing non-existent blend mode*
      * - *Also will throw error if combination of document color mode, bit depth and blend mode is not possible
      * instead of failing silently*
      * - *Prior this version it was possible to set blend mode for background layer which turned it into regular
      * layer as a side effect and also changed its ID. Not it will throw error instead since these side effects
      * are not expected to happen*
      * @minVersion 22.5
      */
    def blendMode: BlendMode = js.native
    def blendMode_=(blendMode: BlendMode): Unit = js.native
    
    /**
      * Bounds of the layer, including the effects.
      * @minVersion 22.5
      */
    def bounds: Bounds = js.native
    
    /**
      * Bounds of the layer excluding effects.
      * @minVersion 22.5
      */
    def boundsNoEffects: Bounds = js.native
    
    /**
      * Moves the layer to a position above the topmost layer or group.
      * @minVersion 23.0
      */
    def bringToFront(): Unit = js.native
    
    /**
      * Clears the layer pixels and does not copy to the clipboard.
      * If no pixel selection is found, select all pixels and clear.
      *
      * @async
      * @minVersion 23.0
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Copies the layer to the clipboard. When the optional argument is set to true, a
      * merged copy is performed (that is, all visible layers are copied to the clipboard).
      *
      * ```javascript
      * await layer.copy(true)
      * await layer.copy()
      * ```
      * @async
      * @minVersion 23.0
      */
    def copy(): js.Promise[Unit] = js.native
    def copy(merge: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Cuts the layer contents to the clipboard. If no selection is found then select all the pixels and then cut.
      *
      * @async
      * @minVersion 23.0
      */
    def cut(): js.Promise[Unit] = js.native
    
    /**
      * Deletes this layer from the document.
      * ```javascript
      * const layers = document.layers
      * layers && layers[0] && layers[0].delete()
      * ```
      * @returns number of layer elements deleted
      * @minVersion 23.0
      */
    def delete(): Unit = js.native
    
    /**
      * The document that contains this layer.
      * @minVersion 23.0
      */
    def document: Document = js.native
    
    /**
      * Duplicates the layer, creating a copy above it in layer stack,
      * and returns the newly created layer.
      *
      * ```javascript
      * // duplicate a layer
      * const copyLayer = await layer.duplicate()
      *
      * // extract to a new document
      * const exportDoc = psApp.documents[1]
      * const exportedLayer = await layer.duplicate(exportDoc)
      * ```
      * @param targetDocument if specified, duplicate to a different document target.
      *
      * @async
      * @minVersion 23.0
      */
    def duplicate(): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Unit, insertionLocation: Unit, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Unit, insertionLocation: ElementPlacement): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Unit, insertionLocation: ElementPlacement, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document, insertionLocation: Unit, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document, insertionLocation: ElementPlacement): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Document, insertionLocation: ElementPlacement, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer, insertionLocation: Unit, name: String): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer, insertionLocation: ElementPlacement): js.Promise[Layer | Null] = js.native
    def duplicate(relativeObject: Layer, insertionLocation: ElementPlacement, name: String): js.Promise[Layer | Null] = js.native
    
    /**
      * The fill opacity of the layer, in percentage.
      * @minVersion 23.0
      */
    def fillOpacity: Double = js.native
    def fillOpacity_=(opacity: Double): Unit = js.native
    
    /**
      * The density of the filter mask, in percentage.
      * @minVersion 23.0
      */
    def filterMaskDensity: Double = js.native
    def filterMaskDensity_=(density: Double): Unit = js.native
    
    /**
      * The feather of the filter mask between 0.0 and 1000.0.
      * @minVersion 23.0
      */
    def filterMaskFeather: Double = js.native
    def filterMaskFeather_=(feather: Double): Unit = js.native
    
    /**
      * Flips the layer on one or both axis.
      *
      * ```javascript
      * // flip horizontally
      * await layer.flip.horizontal()
      * ```
      * @param axis Which axis (or both) to flip the layer on.
      *             - "horizontal": flip layer on horizontal axis
      *             - "vertical": flip layer on vertical axis
      *             - "both": flip layer on both axes
      * @async
      * @minVersion 23.0
      */
    def flip(axis: horizontal | vertical | both): js.Promise[Unit] = js.native
    
    /**
      * ID of the layer, can be used for making batchPlay calls.
      * @minVersion 22.5
      */
    def id: Double = js.native
    
    /**
      * True when the layer is the special Background layer.
      * @minVersion 22.5
      */
    def isBackgroundLayer: Boolean = js.native
    
    /**
      * Whether the layer is being used as a clipping mask.
      * @minVersion 23.0
      */
    def isClippingMask: Boolean = js.native
    def isClippingMask_=(clipped: Boolean): Unit = js.native
    
    /**
      * The kind of the layer.
      * @minVersion 22.5
      */
    def kind: LayerKind = js.native
    
    /**
      * The density of the layer mask, in percentage.
      * @minVersion 23.0
      */
    def layerMaskDensity: Double = js.native
    def layerMaskDensity_=(density: Double): Unit = js.native
    
    /**
      * The feather of the layer mask between 0.0 and 1000.0.
      * @minVersion 23.0
      */
    def layerMaskFeather: Double = js.native
    def layerMaskFeather_=(feather: Double): Unit = js.native
    
    /**
      * The layers inside this group layer.
      * @minVersion 23.0
      */
    def layers: Layers | Null = js.native
    
    /**
      * Creates a link between this layer and the target layer if not already linked,
      * and returns a list of layers linked to this layer.
      *
      * ```javascript
      * // link two layers together
      * const linkedLayers = strokes.link(fillLayer)
      * linkedLayers.forEach((layer) => console.log(layer.name))
      * > "strokes"
      * > "fillLayer"
      * ```
      * @minVersion 23.0
      */
    def link(targetLayer: Layer): js.Array[Layer] = js.native
    
    /**
      * Layers linked to this layer. See [[Layer.link]]
      * @minVersion 22.5
      */
    def linkedLayers: Layers = js.native
    
    /**
      * True if any property of this layer is locked.
      * @minVersion 22.5
      */
    def locked: Boolean = js.native
    
    /**
      * Merges layers. This operates on the currently selected layers. If multiple
      * layers are selected, they will be merged together. If one layer is selected,
      * it is merged down with the layer beneath. In this case, the layer below must
      * be a pixel layer. The merged layer will now be the active layer.
      *
      * @async
      * @minVersion 23.0
      */
    def merge(): js.Promise[Layer] = js.native
    
    /**
      * Moves the layer relative to the layer specified in parameters.
      * "placeAfter" places the layer below relativeObject.
      * "placeBefore" places the layer above relativeObject.
      * "placeInside" places the layer inside relativeObject if relativeObject is a group layer.
      * `ElementPlacement.PLACEINSIDE` is only valid when `relativeObject.kind === LayerKind.group`
      * @minVersion 23.0
      */
    def move(relativeObject: Layer, insertLocation: ElementPlacement): Unit = js.native
    
    /**
      * Name of the layer.
      * @minVersion 22.5
      */
    def name: String = js.native
    /**
      * @ignore
      * Set the name of the layer
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * The master opacity of the layer, in percent.
      * @minVersion 22.5
      */
    def opacity: Double = js.native
    def opacity_=(opacity: Double): Unit = js.native
    
    /**
      * The group layer that contains this layer.
      * It will return null if the layer is a top layer in the document.
      * @minVersion 22.5
      */
    def parent: Layer | Null = js.native
    
    /**
      * When set to true, prevents the pixels of this layer from being edited.
      * @minVersion 22.5
      */
    def pixelsLocked: Boolean = js.native
    def pixelsLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * When set to true, prevents the layer from being moved.
      * @minVersion 22.5
      */
    def positionLocked: Boolean = js.native
    def positionLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * Converts the targeted contents in the layer into a flat, raster image.
      *
      * @async
      * @minVersion 23.0
      */
    def rasterize(target: RasterizeType): js.Promise[Unit] = js.native
    
    /**
      * Rotates the layer.
      *
      * ```javascript
      * // rotate 90 deg counter clockwise
      * await layer.rotate(-90)
      *
      * // rotate 90 deg clockwise relative to top left corner
      * let anchorPos = require('photoshop').constants.AnchorPosition
      * await layer.rotate(90, anchorPos.TOPLEFT)
      * ```
      * @param angle Angle to rotate the layer by in degrees
      * @param anchor Anchor position to rotate around
      * @param options.interpolation Interpolation method to use when resampling the image
      *
      * @async
      * @minVersion 23.0
      */
    def rotate(angle: Double): js.Promise[Unit] = js.native
    def rotate(angle: Double, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def rotate(angle: Double, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def rotate(angle: Double, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def rotate(angle: AngleValue, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    
    /**
      * Scales the layer.
      *
      * Renamed from `resize` in ExtendScript.
      *
      * ```javascript
      * await layer.scale(80, 80)
      *
      * // Scale the layer to be a quarter of the size relative to bottom left corner
      * let anchorPos = require('photoshop').constants.AnchorPosition
      * await layer.scale(50, 50, anchorPos.BOTTOMLEFT)
      * ```
      * @param width Numeric percentage to scale layer horizontally
      * @param height Numeric percentage to scale layer vertically
      * @param anchor Anchor position to rotate around
      * @param options.interpolation Interpolation method to use when resampling the image
      *
      * @async
      * @minVersion 23.0
      */
    def scale(width: Double, height: Double): js.Promise[Unit] = js.native
    def scale(width: Double, height: Double, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: Double, height: Double, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: Double, height: Double, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: Double, height: PercentValue, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: Double, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue, anchor: Unit, options: Interpolation): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue, anchor: AnchorPosition): js.Promise[Unit] = js.native
    def scale(width: PercentValue, height: PercentValue, anchor: AnchorPosition, options: Interpolation): js.Promise[Unit] = js.native
    
    /**
      * @ignore
      * The selection status of the layer.
      * @minVersion 22.5
      */
    def selected: Boolean = js.native
    def selected_=(select: Boolean): Unit = js.native
    
    /**
      * Moves the layer to the bottom. If the bottom layer is the
      * background, it will move the layer to the position above the background.
      * If it is in a group, it will move to the bottom of the group.
      * @minVersion 23.0
      */
    def sendToBack(): Unit = js.native
    
    /**
      * @ignore
      */
    /* private */ var setLocking: Any = js.native
    
    /**
      * Applies a skew to the layer.
      *
      * ```javascript
      * // parellelogram shape
      * await layer.skew(-15, 0)
      * ```
      * @param angleH Horizontal angle to skew by
      * @param angleV Vertical angle to skew by
      * @param option.interpolation Interpolation method to use when resampling the image
      *
      * @async
      * @minVersion 23.0
      */
    def skew(angleH: Double, angleV: Double): js.Promise[Unit] = js.native
    def skew(angleH: Double, angleV: Double, options: Interpolation): js.Promise[Unit] = js.native
    def skew(angleH: Double, angleV: AngleValue): js.Promise[Unit] = js.native
    def skew(angleH: Double, angleV: AngleValue, options: Interpolation): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: Double): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: Double, options: Interpolation): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: AngleValue): js.Promise[Unit] = js.native
    def skew(angleH: AngleValue, angleV: AngleValue, options: Interpolation): js.Promise[Unit] = js.native
    
    /**
      * The object that contains properties and methods related to Text
      * for Layers whose `kind` is equal to `LayerKind.TEXT`
      * @minVersion 24.2
      */
    def textItem: TextItem = js.native
    
    /**
      * Moves the layer (translation).
      *
      * ```javascript
      * // Translate the layer to the left by 200px
      * await layer.translate(-200, 0)
      *
      * // move the layer one height down
      * let xOffsetPct = {_unit: "percentUnit", _value: 0};
      * let yOffsetPct = {_unit: "percentUnit", _value: 100};
      * await layer.translate(xOffsetPct, yOffsetPct);
      * ```
      * @param horizontal Numeric value to offset layer by in pixels or percent
      * @param vertical Numeric value to offset layer by in pixels or percent
      *
      * @async
      * @minVersion 23.0
      */
    def translate(horizontal: Double, vertical: Double): js.Promise[Unit] = js.native
    def translate(horizontal: Double, vertical: PercentValue): js.Promise[Unit] = js.native
    def translate(horizontal: Double, vertical: PixelValue): js.Promise[Unit] = js.native
    def translate(horizontal: PercentValue, vertical: Double): js.Promise[Unit] = js.native
    def translate(horizontal: PercentValue, vertical: PercentValue): js.Promise[Unit] = js.native
    def translate(horizontal: PercentValue, vertical: PixelValue): js.Promise[Unit] = js.native
    def translate(horizontal: PixelValue, vertical: Double): js.Promise[Unit] = js.native
    def translate(horizontal: PixelValue, vertical: PercentValue): js.Promise[Unit] = js.native
    def translate(horizontal: PixelValue, vertical: PixelValue): js.Promise[Unit] = js.native
    
    /**
      * When set to true, prevents the transparent pixels from being edited
      * @minVersion 22.5
      */
    def transparentPixelsLocked: Boolean = js.native
    def transparentPixelsLocked_=(locking: Boolean): Unit = js.native
    
    /**
      * The class name of the referenced object: *"Layer"*.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.Layer = js.native
    
    /**
      * Unlinks the layer from any existing links.
      *
      * ```javascript
      * // detach layer from any existing links
      * await layer.unlink()
      * ```
      * @async
      * @minVersion 23.0
      */
    def unlink(): js.Promise[Unit] = js.native
    
    /**
      * The density of the vector mask, in percentage.
      * @minVersion 23.0
      */
    def vectorMaskDensity: Double = js.native
    def vectorMaskDensity_=(density: Double): Unit = js.native
    
    /**
      * The feather of the vector mask between 0.0 and 1000.0.
      * @minVersion 23.0
      */
    def vectorMaskFeather: Double = js.native
    def vectorMaskFeather_=(feather: Double): Unit = js.native
    
    /**
      * True when the layer is visible.
      * @minVersion 22.5
      */
    def visible: Boolean = js.native
    def visible_=(visible: Boolean): Unit = js.native
  }
  
  @js.native
  sealed trait PSLayerKind extends StObject
  @JSImport("photoshop/dom/Layer", "PSLayerKind")
  @js.native
  object PSLayerKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PSLayerKind & Double] = js.native
    
    @js.native
    sealed trait adjustment
      extends StObject
         with PSLayerKind
    /* 2 */ val adjustment: typings.photoshop.domLayerMod.PSLayerKind.adjustment & Double = js.native
    
    @js.native
    sealed trait any
      extends StObject
         with PSLayerKind
    /* 0 */ val any: typings.photoshop.domLayerMod.PSLayerKind.any & Double = js.native
    
    @js.native
    sealed trait background
      extends StObject
         with PSLayerKind
    /* 12 */ val background: typings.photoshop.domLayerMod.PSLayerKind.background & Double = js.native
    
    @js.native
    sealed trait gradient
      extends StObject
         with PSLayerKind
    /* 9 */ val gradient: typings.photoshop.domLayerMod.PSLayerKind.gradient & Double = js.native
    
    @js.native
    sealed trait group
      extends StObject
         with PSLayerKind
    /* 7 */ val group: typings.photoshop.domLayerMod.PSLayerKind.group & Double = js.native
    
    @js.native
    sealed trait groupEnd
      extends StObject
         with PSLayerKind
    /* 13 */ val groupEnd: typings.photoshop.domLayerMod.PSLayerKind.groupEnd & Double = js.native
    
    @js.native
    sealed trait pattern
      extends StObject
         with PSLayerKind
    /* 10 */ val pattern: typings.photoshop.domLayerMod.PSLayerKind.pattern & Double = js.native
    
    @js.native
    sealed trait pixel
      extends StObject
         with PSLayerKind
    /* 1 */ val pixel: typings.photoshop.domLayerMod.PSLayerKind.pixel & Double = js.native
    
    @js.native
    sealed trait smartObject
      extends StObject
         with PSLayerKind
    /* 5 */ val smartObject: typings.photoshop.domLayerMod.PSLayerKind.smartObject & Double = js.native
    
    @js.native
    sealed trait solidColor
      extends StObject
         with PSLayerKind
    /* 11 */ val solidColor: typings.photoshop.domLayerMod.PSLayerKind.solidColor & Double = js.native
    
    @js.native
    sealed trait text
      extends StObject
         with PSLayerKind
    /* 3 */ val text: typings.photoshop.domLayerMod.PSLayerKind.text & Double = js.native
    
    @js.native
    sealed trait threeD
      extends StObject
         with PSLayerKind
    /* 8 */ val threeD: typings.photoshop.domLayerMod.PSLayerKind.threeD & Double = js.native
    
    @js.native
    sealed trait vector
      extends StObject
         with PSLayerKind
    /* 4 */ val vector: typings.photoshop.domLayerMod.PSLayerKind.vector & Double = js.native
    
    @js.native
    sealed trait video
      extends StObject
         with PSLayerKind
    /* 6 */ val video: typings.photoshop.domLayerMod.PSLayerKind.video & Double = js.native
  }
}
