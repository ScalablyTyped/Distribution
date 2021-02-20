package typings.mobileDetect

import typings.mobileDetect.mod.MobileDetectComplexRules
import typings.mobileDetect.mod.MobileDetectRules
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FullPattern extends StObject {
    
    var fullPattern: RegExp = js.native
    
    var shortPattern: RegExp = js.native
    
    var tabletPattern: RegExp = js.native
  }
  object FullPattern {
    
    @scala.inline
    def apply(fullPattern: RegExp, shortPattern: RegExp, tabletPattern: RegExp): FullPattern = {
      val __obj = js.Dynamic.literal(fullPattern = fullPattern.asInstanceOf[js.Any], shortPattern = shortPattern.asInstanceOf[js.Any], tabletPattern = tabletPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullPattern]
    }
    
    @scala.inline
    implicit class FullPatternMutableBuilder[Self <: FullPattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullPattern(value: RegExp): Self = StObject.set(x, "fullPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortPattern(value: RegExp): Self = StObject.set(x, "shortPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabletPattern(value: RegExp): Self = StObject.set(x, "tabletPattern", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Oss extends StObject {
    
    var oss: MobileDetectRules = js.native
    
    var phones: MobileDetectRules = js.native
    
    var props: MobileDetectComplexRules = js.native
    
    var tablets: MobileDetectRules = js.native
    
    var uas: MobileDetectRules = js.native
    
    var utils: MobileDetectRules = js.native
  }
  object Oss {
    
    @scala.inline
    def apply(
      oss: MobileDetectRules,
      phones: MobileDetectRules,
      props: MobileDetectComplexRules,
      tablets: MobileDetectRules,
      uas: MobileDetectRules,
      utils: MobileDetectRules
    ): Oss = {
      val __obj = js.Dynamic.literal(oss = oss.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tablets = tablets.asInstanceOf[js.Any], uas = uas.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oss]
    }
    
    @scala.inline
    implicit class OssMutableBuilder[Self <: Oss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOss(value: MobileDetectRules): Self = StObject.set(x, "oss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhones(value: MobileDetectRules): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: MobileDetectComplexRules): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablets(value: MobileDetectRules): Self = StObject.set(x, "tablets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUas(value: MobileDetectRules): Self = StObject.set(x, "uas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtils(value: MobileDetectRules): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    }
  }
}
