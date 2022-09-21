package typings.mobileDetect

import org.scalablytyped.runtime.StringDictionary
import typings.mobileDetect.anon.FullPattern
import typings.mobileDetect.anon.Oss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobile-detect", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MobileDetect {
    def this(userAgent: String) = this()
    def this(userAgent: String, maxPhoneWidth: Double) = this()
  }
  @JSImport("mobile-detect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // only used internally; if necessary, one can replace, intercept or augment particular methods or values
  /* static member */
  @JSImport("mobile-detect", "_impl")
  @js.native
  def impl: MobileDetectImpl = js.native
  
  inline def impl_=(x: MobileDetectImpl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_impl")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def isPhoneSized(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneSized")().asInstanceOf[Boolean]
  inline def isPhoneSized(maxPhoneWidth: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneSized")(maxPhoneWidth.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  @JSImport("mobile-detect", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait MobileDetect extends StObject {
    
    def is(key: String): Boolean = js.native
    
    def isPhoneSized(): Boolean = js.native
    def isPhoneSized(maxPhoneWidth: Double): Boolean = js.native
    
    def `match`(pattern: String): Boolean = js.native
    def `match`(pattern: js.RegExp): Boolean = js.native
    
    def mobile(): String | Null = js.native
    
    def mobileGrade(): String = js.native
    
    def os(): String = js.native
    
    def phone(): String | Null = js.native
    
    def tablet(): String | Null = js.native
    
    def userAgent(): String = js.native
    
    def userAgents(): js.Array[String] = js.native
    
    def version(value: String): Double = js.native
    
    def versionStr(value: String): String = js.native
  }
  
  type MobileDetectComplexRules = StringDictionary[String | js.RegExp | (js.Array[js.RegExp | String])]
  
  @js.native
  trait MobileDetectImpl extends StObject {
    
    var FALLBACK_MOBILE: String = js.native
    
    var FALLBACK_PHONE: String = js.native
    
    var FALLBACK_TABLET: String = js.native
    
    var detectMobileBrowsers: FullPattern = js.native
    
    def detectOS(userAgent: String): String = js.native
    
    def findMatch(rules: MobileDetectRules, userAgent: String): String = js.native
    
    def findMatches(rules: MobileDetectRules, userAgent: String): js.Array[String] = js.native
    
    def getDeviceSmallerSide(): Double = js.native
    
    def getVersion(propertyName: String, userAgent: String): Double = js.native
    
    def getVersionStr(propertyName: String, userAgent: String): String = js.native
    
    def isMobileFallback(userAgent: String): Boolean = js.native
    
    def isTabletFallback(userAgent: String): Boolean = js.native
    
    var mobileDetectRules: Oss = js.native
    
    def mobileGrade(md: MobileDetect): String = js.native
    
    def prepareDetectionCache(cache: js.Object, userAgent: String): Unit = js.native
    def prepareDetectionCache(cache: js.Object, userAgent: String, maxPhoneWidth: Double): Unit = js.native
    
    def prepareVersionNo(version: String): Double = js.native
  }
  
  type MobileDetectRules = StringDictionary[String | js.RegExp]
}
