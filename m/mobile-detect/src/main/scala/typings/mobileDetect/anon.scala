package typings.mobileDetect

import typings.mobileDetect.mod.MobileDetectComplexRules
import typings.mobileDetect.mod.MobileDetectRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FullPattern extends StObject {
    
    var fullPattern: js.RegExp
    
    var shortPattern: js.RegExp
    
    var tabletPattern: js.RegExp
  }
  object FullPattern {
    
    inline def apply(fullPattern: js.RegExp, shortPattern: js.RegExp, tabletPattern: js.RegExp): FullPattern = {
      val __obj = js.Dynamic.literal(fullPattern = fullPattern.asInstanceOf[js.Any], shortPattern = shortPattern.asInstanceOf[js.Any], tabletPattern = tabletPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullPattern]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullPattern] (val x: Self) extends AnyVal {
      
      inline def setFullPattern(value: js.RegExp): Self = StObject.set(x, "fullPattern", value.asInstanceOf[js.Any])
      
      inline def setShortPattern(value: js.RegExp): Self = StObject.set(x, "shortPattern", value.asInstanceOf[js.Any])
      
      inline def setTabletPattern(value: js.RegExp): Self = StObject.set(x, "tabletPattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait Oss extends StObject {
    
    var oss: MobileDetectRules
    
    var phones: MobileDetectRules
    
    var props: MobileDetectComplexRules
    
    var tablets: MobileDetectRules
    
    var uas: MobileDetectRules
    
    var utils: MobileDetectRules
  }
  object Oss {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Oss] (val x: Self) extends AnyVal {
      
      inline def setOss(value: MobileDetectRules): Self = StObject.set(x, "oss", value.asInstanceOf[js.Any])
      
      inline def setPhones(value: MobileDetectRules): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      inline def setProps(value: MobileDetectComplexRules): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setTablets(value: MobileDetectRules): Self = StObject.set(x, "tablets", value.asInstanceOf[js.Any])
      
      inline def setUas(value: MobileDetectRules): Self = StObject.set(x, "uas", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: MobileDetectRules): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    }
  }
}
