package typings.next

import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsTelemetryPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("next/dist/build/webpack/plugins/telemetry-plugin", "TelemetryPlugin")
  @js.native
  open class TelemetryPlugin protected () extends StObject {
    def this(buildFeaturesMap: Map[Feature, Boolean]) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def packagesUsedInServerSideProps(): js.Array[String] = js.native
    
    /* private */ var usageTracker: Any = js.native
    
    def usages(): js.Array[FeatureUsage] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.nextSlashimage
    - typings.next.nextStrings.nextSlashfutureSlashimage
    - typings.next.nextStrings.nextSlashscript
    - typings.next.nextStrings.nextSlashdynamic
    - typings.next.nextStrings.swcLoader
    - typings.next.nextStrings.swcMinify
    - typings.next.nextStrings.swcRelay
    - typings.next.nextStrings.swcStyledComponents
    - typings.next.nextStrings.swcReactRemoveProperties
    - typings.next.nextStrings.swcExperimentalDecorators
    - typings.next.nextStrings.swcRemoveConsole
    - typings.next.nextStrings.swcImportSource
    - typings.next.nextStrings.swcEmotion
    - / * template literal string: swc/target/${SWC_TARGET_TRIPLE} * / java.lang.String
  */
  type Feature = _Feature | (/* template literal string: swc/target/${SWC_TARGET_TRIPLE} */ String)
  
  trait FeatureUsage extends StObject {
    
    var featureName: Feature
    
    var invocationCount: Double
  }
  object FeatureUsage {
    
    inline def apply(featureName: Feature, invocationCount: Double): FeatureUsage = {
      val __obj = js.Dynamic.literal(featureName = featureName.asInstanceOf[js.Any], invocationCount = invocationCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureUsage]
    }
    
    extension [Self <: FeatureUsage](x: Self) {
      
      inline def setFeatureName(value: Feature): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
      
      inline def setInvocationCount(value: Double): Self = StObject.set(x, "invocationCount", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.`x86_64-apple-darwin`
    - typings.next.nextStrings.`x86_64-unknown-linux-gnu`
    - typings.next.nextStrings.`x86_64-pc-windows-msvc`
    - typings.next.nextStrings.`i686-pc-windows-msvc`
    - typings.next.nextStrings.`aarch64-unknown-linux-gnu`
    - typings.next.nextStrings.`armv7-unknown-linux-gnueabihf`
    - typings.next.nextStrings.`aarch64-apple-darwin`
    - typings.next.nextStrings.`aarch64-linux-android`
    - typings.next.nextStrings.`arm-linux-androideabi`
    - typings.next.nextStrings.`x86_64-unknown-freebsd`
    - typings.next.nextStrings.`x86_64-unknown-linux-musl`
    - typings.next.nextStrings.`aarch64-unknown-linux-musl`
    - typings.next.nextStrings.`aarch64-pc-windows-msvc`
  */
  trait SWC_TARGET_TRIPLE extends StObject
  object SWC_TARGET_TRIPLE {
    
    inline def `aarch64-apple-darwin`: typings.next.nextStrings.`aarch64-apple-darwin` = "aarch64-apple-darwin".asInstanceOf[typings.next.nextStrings.`aarch64-apple-darwin`]
    
    inline def `aarch64-linux-android`: typings.next.nextStrings.`aarch64-linux-android` = "aarch64-linux-android".asInstanceOf[typings.next.nextStrings.`aarch64-linux-android`]
    
    inline def `aarch64-pc-windows-msvc`: typings.next.nextStrings.`aarch64-pc-windows-msvc` = "aarch64-pc-windows-msvc".asInstanceOf[typings.next.nextStrings.`aarch64-pc-windows-msvc`]
    
    inline def `aarch64-unknown-linux-gnu`: typings.next.nextStrings.`aarch64-unknown-linux-gnu` = "aarch64-unknown-linux-gnu".asInstanceOf[typings.next.nextStrings.`aarch64-unknown-linux-gnu`]
    
    inline def `aarch64-unknown-linux-musl`: typings.next.nextStrings.`aarch64-unknown-linux-musl` = "aarch64-unknown-linux-musl".asInstanceOf[typings.next.nextStrings.`aarch64-unknown-linux-musl`]
    
    inline def `arm-linux-androideabi`: typings.next.nextStrings.`arm-linux-androideabi` = "arm-linux-androideabi".asInstanceOf[typings.next.nextStrings.`arm-linux-androideabi`]
    
    inline def `armv7-unknown-linux-gnueabihf`: typings.next.nextStrings.`armv7-unknown-linux-gnueabihf` = "armv7-unknown-linux-gnueabihf".asInstanceOf[typings.next.nextStrings.`armv7-unknown-linux-gnueabihf`]
    
    inline def `i686-pc-windows-msvc`: typings.next.nextStrings.`i686-pc-windows-msvc` = "i686-pc-windows-msvc".asInstanceOf[typings.next.nextStrings.`i686-pc-windows-msvc`]
    
    inline def `x86_64-apple-darwin`: typings.next.nextStrings.`x86_64-apple-darwin` = "x86_64-apple-darwin".asInstanceOf[typings.next.nextStrings.`x86_64-apple-darwin`]
    
    inline def `x86_64-pc-windows-msvc`: typings.next.nextStrings.`x86_64-pc-windows-msvc` = "x86_64-pc-windows-msvc".asInstanceOf[typings.next.nextStrings.`x86_64-pc-windows-msvc`]
    
    inline def `x86_64-unknown-freebsd`: typings.next.nextStrings.`x86_64-unknown-freebsd` = "x86_64-unknown-freebsd".asInstanceOf[typings.next.nextStrings.`x86_64-unknown-freebsd`]
    
    inline def `x86_64-unknown-linux-gnu`: typings.next.nextStrings.`x86_64-unknown-linux-gnu` = "x86_64-unknown-linux-gnu".asInstanceOf[typings.next.nextStrings.`x86_64-unknown-linux-gnu`]
    
    inline def `x86_64-unknown-linux-musl`: typings.next.nextStrings.`x86_64-unknown-linux-musl` = "x86_64-unknown-linux-musl".asInstanceOf[typings.next.nextStrings.`x86_64-unknown-linux-musl`]
  }
  
  trait _Feature extends StObject
}
