package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemasTypesMod {
  
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
    
    @scala.inline
    def apply(): CreateSchemaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSchemaOptions]
    }
    
    @scala.inline
    implicit class CreateSchemaOptionsMutableBuilder[Self <: CreateSchemaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
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
