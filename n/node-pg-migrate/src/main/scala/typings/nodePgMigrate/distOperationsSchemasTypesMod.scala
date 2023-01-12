package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typings.nodePgMigrate.distOperationsGeneralTypesMod.IfNotExistsOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsSchemasTypesMod {
  
  @js.native
  trait CreateSchema extends CreateSchemaFn {
    
    def reverse(schemaName: String): String | js.Array[String] = js.native
    def reverse(schemaName: String, schemaOptions: CreateSchemaOptions & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateSchemaFn = js.native
  }
  
  type CreateSchemaFn = js.Function2[
    /* schemaName */ String, 
    /* schemaOptions */ js.UndefOr[CreateSchemaOptions & DropOptions], 
    String | js.Array[String]
  ]
  
  trait CreateSchemaOptions
    extends StObject
       with IfNotExistsOption {
    
    var authorization: js.UndefOr[String] = js.undefined
  }
  object CreateSchemaOptions {
    
    inline def apply(): CreateSchemaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSchemaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateSchemaOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    }
  }
  
  type DropSchema = js.Function2[
    /* schemaName */ String, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameSchema extends RenameSchemaFn {
    
    def reverse(oldSchemaName: String, newSchemaName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameSchemaFn = js.native
  }
  
  type RenameSchemaFn = js.Function2[/* oldSchemaName */ String, /* newSchemaName */ String, String | js.Array[String]]
}
