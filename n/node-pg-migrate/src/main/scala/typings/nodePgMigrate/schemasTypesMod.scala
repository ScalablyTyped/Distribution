package typings.nodePgMigrate

import typings.nodePgMigrate.anon.ReverseCreateSchemaFn
import typings.nodePgMigrate.anon.ReverseRenameSchemaFn
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemasTypesMod {
  
  type CreateSchema = CreateSchemaFn with ReverseCreateSchemaFn
  
  type CreateSchemaFn = js.Function2[
    /* schemaName */ String, 
    /* schemaOptions */ js.UndefOr[CreateSchemaOptions with DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateSchemaOptions extends IfNotExistsOption {
    
    var authorization: js.UndefOr[String] = js.native
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
  
  type RenameSchema = RenameSchemaFn with ReverseRenameSchemaFn
  
  type RenameSchemaFn = js.Function2[/* oldSchemaName */ String, /* newSchemaName */ String, String | js.Array[String]]
}
