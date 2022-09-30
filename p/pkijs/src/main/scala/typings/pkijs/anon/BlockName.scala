package typings.pkijs.anon

import typings.pkijs.mod.AttributeSchema
import typings.pkijs.mod.RelativeDistinguishedNamesSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockName extends StObject {
  
  var CertificationRequestInfo: js.UndefOr[String] = js.undefined
  
  var CertificationRequestInfoAttributes: js.UndefOr[String] = js.undefined
  
  var CertificationRequestInfoVersion: js.UndefOr[String] = js.undefined
  
  var attributes: js.UndefOr[AttributeSchema] = js.undefined
  
  var blockName: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[RelativeDistinguishedNamesSchema] = js.undefined
}
object BlockName {
  
  inline def apply(): BlockName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockName]
  }
  
  extension [Self <: BlockName](x: Self) {
    
    inline def setAttributes(value: AttributeSchema): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setBlockNameUndefined: Self = StObject.set(x, "blockName", js.undefined)
    
    inline def setCertificationRequestInfo(value: String): Self = StObject.set(x, "CertificationRequestInfo", value.asInstanceOf[js.Any])
    
    inline def setCertificationRequestInfoAttributes(value: String): Self = StObject.set(x, "CertificationRequestInfoAttributes", value.asInstanceOf[js.Any])
    
    inline def setCertificationRequestInfoAttributesUndefined: Self = StObject.set(x, "CertificationRequestInfoAttributes", js.undefined)
    
    inline def setCertificationRequestInfoUndefined: Self = StObject.set(x, "CertificationRequestInfo", js.undefined)
    
    inline def setCertificationRequestInfoVersion(value: String): Self = StObject.set(x, "CertificationRequestInfoVersion", value.asInstanceOf[js.Any])
    
    inline def setCertificationRequestInfoVersionUndefined: Self = StObject.set(x, "CertificationRequestInfoVersion", js.undefined)
    
    inline def setSubject(value: RelativeDistinguishedNamesSchema): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
