package typings.nodejsLicenseFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodejs-license-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(options: GenerateOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(options: ParseOptions): License = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[License]
  
  trait GenerateOptions extends StObject {
    
    var data: Any
    
    var privateKey: js.UndefOr[String] = js.undefined
    
    var privateKeyPath: js.UndefOr[String] = js.undefined
    
    var template: String
  }
  object GenerateOptions {
    
    inline def apply(data: Any, template: String): GenerateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyPathUndefined: Self = StObject.set(x, "privateKeyPath", js.undefined)
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  trait License extends StObject {
    
    var data: Any
    
    var serial: String
    
    var valid: Boolean
  }
  object License {
    
    inline def apply(data: Any, serial: String, valid: Boolean): License = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[License]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: License] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions extends StObject {
    
    var licenseFile: js.UndefOr[String] = js.undefined
    
    var licenseFilePath: js.UndefOr[String] = js.undefined
    
    var publicKey: js.UndefOr[String] = js.undefined
    
    var publicKeyPath: js.UndefOr[String] = js.undefined
    
    var template: String
  }
  object ParseOptions {
    
    inline def apply(template: String): ParseOptions = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setLicenseFile(value: String): Self = StObject.set(x, "licenseFile", value.asInstanceOf[js.Any])
      
      inline def setLicenseFilePath(value: String): Self = StObject.set(x, "licenseFilePath", value.asInstanceOf[js.Any])
      
      inline def setLicenseFilePathUndefined: Self = StObject.set(x, "licenseFilePath", js.undefined)
      
      inline def setLicenseFileUndefined: Self = StObject.set(x, "licenseFile", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyPath(value: String): Self = StObject.set(x, "publicKeyPath", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyPathUndefined: Self = StObject.set(x, "publicKeyPath", js.undefined)
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
