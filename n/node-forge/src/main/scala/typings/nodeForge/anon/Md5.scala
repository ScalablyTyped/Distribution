package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Md5 extends StObject {
  
  @JSName("sha512/224")
  var sha512Slash224: /* import warning: importer.ImportType#apply Failed type conversion: typeof md['sha512/224'] */ js.Any
  
  @JSName("sha512/256")
  var sha512Slash256: /* import warning: importer.ImportType#apply Failed type conversion: typeof md['sha512/256'] */ js.Any
}
object Md5 {
  
  inline def apply(
    sha512Slash224: /* import warning: importer.ImportType#apply Failed type conversion: typeof md['sha512/224'] */ js.Any,
    sha512Slash256: /* import warning: importer.ImportType#apply Failed type conversion: typeof md['sha512/256'] */ js.Any
  ): Md5 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sha512/224")(sha512Slash224.asInstanceOf[js.Any])
    __obj.updateDynamic("sha512/256")(sha512Slash256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md5]
  }
  
  extension [Self <: Md5](x: Self) {
    
    inline def setSha512Slash224(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typeof md['sha512/224'] */ js.Any
    ): Self = StObject.set(x, "sha512/224", value.asInstanceOf[js.Any])
    
    inline def setSha512Slash256(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typeof md['sha512/256'] */ js.Any
    ): Self = StObject.set(x, "sha512/256", value.asInstanceOf[js.Any])
  }
}
