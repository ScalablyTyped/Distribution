package typings.oracleOraclejet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojresponsiveutilsMod {
  
  @JSImport("@oracle/oraclejet/ojresponsiveutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(size1: SCREEN_RANGE, size2: SCREEN_RANGE): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(size1.asInstanceOf[js.Any], size2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getFrameworkQuery(frameworkQueryKey: FRAMEWORK_QUERY_KEY): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameworkQuery")(frameworkQueryKey.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.oracleOraclejetStrings.`sm-up`
    - typings.oracleOraclejet.oracleOraclejetStrings.`md-up`
    - typings.oracleOraclejet.oracleOraclejetStrings.`lg-up`
    - typings.oracleOraclejet.oracleOraclejetStrings.`xl-up`
    - typings.oracleOraclejet.oracleOraclejetStrings.`xxl-up`
    - typings.oracleOraclejet.oracleOraclejetStrings.`sm-only`
    - typings.oracleOraclejet.oracleOraclejetStrings.`md-only`
    - typings.oracleOraclejet.oracleOraclejetStrings.`lg-only`
    - typings.oracleOraclejet.oracleOraclejetStrings.`xl-only`
    - typings.oracleOraclejet.oracleOraclejetStrings.`md-down`
    - typings.oracleOraclejet.oracleOraclejetStrings.`lg-down`
    - typings.oracleOraclejet.oracleOraclejetStrings.`xl-down`
    - typings.oracleOraclejet.oracleOraclejetStrings.`high-resolution`
  */
  trait FRAMEWORK_QUERY_KEY extends StObject
  object FRAMEWORK_QUERY_KEY {
    
    inline def `high-resolution`: typings.oracleOraclejet.oracleOraclejetStrings.`high-resolution` = "high-resolution".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`high-resolution`]
    
    inline def `lg-down`: typings.oracleOraclejet.oracleOraclejetStrings.`lg-down` = "lg-down".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`lg-down`]
    
    inline def `lg-only`: typings.oracleOraclejet.oracleOraclejetStrings.`lg-only` = "lg-only".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`lg-only`]
    
    inline def `lg-up`: typings.oracleOraclejet.oracleOraclejetStrings.`lg-up` = "lg-up".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`lg-up`]
    
    inline def `md-down`: typings.oracleOraclejet.oracleOraclejetStrings.`md-down` = "md-down".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`md-down`]
    
    inline def `md-only`: typings.oracleOraclejet.oracleOraclejetStrings.`md-only` = "md-only".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`md-only`]
    
    inline def `md-up`: typings.oracleOraclejet.oracleOraclejetStrings.`md-up` = "md-up".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`md-up`]
    
    inline def `sm-only`: typings.oracleOraclejet.oracleOraclejetStrings.`sm-only` = "sm-only".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`sm-only`]
    
    inline def `sm-up`: typings.oracleOraclejet.oracleOraclejetStrings.`sm-up` = "sm-up".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`sm-up`]
    
    inline def `xl-down`: typings.oracleOraclejet.oracleOraclejetStrings.`xl-down` = "xl-down".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`xl-down`]
    
    inline def `xl-only`: typings.oracleOraclejet.oracleOraclejetStrings.`xl-only` = "xl-only".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`xl-only`]
    
    inline def `xl-up`: typings.oracleOraclejet.oracleOraclejetStrings.`xl-up` = "xl-up".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`xl-up`]
    
    inline def `xxl-up`: typings.oracleOraclejet.oracleOraclejetStrings.`xxl-up` = "xxl-up".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.`xxl-up`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.oracleOraclejetStrings.sm
    - typings.oracleOraclejet.oracleOraclejetStrings.md
    - typings.oracleOraclejet.oracleOraclejetStrings.lg
    - typings.oracleOraclejet.oracleOraclejetStrings.xl
    - typings.oracleOraclejet.oracleOraclejetStrings.xxl
  */
  trait SCREEN_RANGE extends StObject
  object SCREEN_RANGE {
    
    inline def lg: typings.oracleOraclejet.oracleOraclejetStrings.lg = "lg".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.lg]
    
    inline def md: typings.oracleOraclejet.oracleOraclejetStrings.md = "md".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.md]
    
    inline def sm: typings.oracleOraclejet.oracleOraclejetStrings.sm = "sm".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.sm]
    
    inline def xl: typings.oracleOraclejet.oracleOraclejetStrings.xl = "xl".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.xl]
    
    inline def xxl: typings.oracleOraclejet.oracleOraclejetStrings.xxl = "xxl".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.xxl]
  }
}
