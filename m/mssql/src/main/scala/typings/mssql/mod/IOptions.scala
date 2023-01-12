package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tds.ConnectionOptions * / any, 'useColumnNames'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tds.ConnectionOptions * / any[P]} */ trait IOptions extends StObject {
  
  var beforeConnect: js.UndefOr[Unit] = js.undefined
  
  var connectionString: js.UndefOr[String] = js.undefined
  
  var trustedConnection: js.UndefOr[Boolean] = js.undefined
}
object IOptions {
  
  inline def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
    
    inline def setBeforeConnect(value: Unit): Self = StObject.set(x, "beforeConnect", value.asInstanceOf[js.Any])
    
    inline def setBeforeConnectUndefined: Self = StObject.set(x, "beforeConnect", js.undefined)
    
    inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    inline def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
    
    inline def setTrustedConnection(value: Boolean): Self = StObject.set(x, "trustedConnection", value.asInstanceOf[js.Any])
    
    inline def setTrustedConnectionUndefined: Self = StObject.set(x, "trustedConnection", js.undefined)
  }
}
