package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sha1 extends StObject {
  
  var md5: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.md5 */ Any
  
  var sha1: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha1 */ Any
  
  var sha256: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha256 */ Any
  
  var sha384: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha384 */ Any
  
  var sha512: Typeofsha512
  
  @JSName("sha512/224")
  var sha512Slash224: /* import warning: importer.ImportType#apply Failed type conversion: node-forge.anon.Typeofmd['sha512/224'] */ js.Any
  
  @JSName("sha512/256")
  var sha512Slash256: /* import warning: importer.ImportType#apply Failed type conversion: node-forge.anon.Typeofmd['sha512/256'] */ js.Any
}
object Sha1 {
  
  inline def apply(
    md5: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.md5 */ Any,
    sha1: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha1 */ Any,
    sha256: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha256 */ Any,
    sha384: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha384 */ Any,
    sha512: Typeofsha512,
    sha512Slash224: /* import warning: importer.ImportType#apply Failed type conversion: node-forge.anon.Typeofmd['sha512/224'] */ js.Any,
    sha512Slash256: /* import warning: importer.ImportType#apply Failed type conversion: node-forge.anon.Typeofmd['sha512/256'] */ js.Any
  ): Sha1 = {
    val __obj = js.Dynamic.literal(md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha384 = sha384.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.updateDynamic("sha512/224")(sha512Slash224.asInstanceOf[js.Any])
    __obj.updateDynamic("sha512/256")(sha512Slash256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sha1] (val x: Self) extends AnyVal {
    
    inline def setMd5(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.md5 */ Any): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha1 */ Any): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha256(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha256 */ Any): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha384(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha384 */ Any): Self = StObject.set(x, "sha384", value.asInstanceOf[js.Any])
    
    inline def setSha512(value: Typeofsha512): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
    
    inline def setSha512Slash224(
      value: /* import warning: importer.ImportType#apply Failed type conversion: node-forge.anon.Typeofmd['sha512/224'] */ js.Any
    ): Self = StObject.set(x, "sha512/224", value.asInstanceOf[js.Any])
    
    inline def setSha512Slash256(
      value: /* import warning: importer.ImportType#apply Failed type conversion: node-forge.anon.Typeofmd['sha512/256'] */ js.Any
    ): Self = StObject.set(x, "sha512/256", value.asInstanceOf[js.Any])
  }
}
