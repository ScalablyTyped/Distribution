package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.CASCADED
import typings.nodePgMigrate.nodePgMigrateStrings.LOCAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsTypesMod {
  
  type AlterView = js.Function2[/* viewName */ Name, /* options */ AlterViewOptions, String | js.Array[String]]
  
  type AlterViewColumn = js.Function3[
    /* viewName */ Name, 
    /* columnName */ String, 
    /* options */ AlterViewColumnOptions, 
    String | js.Array[String]
  ]
  
  trait AlterViewColumnOptions extends StObject {
    
    var default: js.UndefOr[Value] = js.undefined
  }
  object AlterViewColumnOptions {
    
    inline def apply(): AlterViewColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterViewColumnOptions]
    }
    
    extension [Self <: AlterViewColumnOptions](x: Self) {
      
      inline def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "default", js.Array(value :_*))
    }
  }
  
  trait AlterViewOptions extends StObject {
    
    var checkOption: js.UndefOr[Null | CASCADED | LOCAL] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object AlterViewOptions {
    
    inline def apply(): AlterViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterViewOptions]
    }
    
    extension [Self <: AlterViewOptions](x: Self) {
      
      inline def setCheckOption(value: CASCADED | LOCAL): Self = StObject.set(x, "checkOption", value.asInstanceOf[js.Any])
      
      inline def setCheckOptionNull: Self = StObject.set(x, "checkOption", null)
      
      inline def setCheckOptionUndefined: Self = StObject.set(x, "checkOption", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait CreateView extends CreateViewFn {
    
    def reverse(viewName: Name, options: CreateViewOptions & DropOptions, definition: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateViewFn = js.native
  }
  
  type CreateViewFn = js.Function3[
    /* viewName */ Name, 
    /* options */ CreateViewOptions & DropOptions, 
    /* definition */ String, 
    String | js.Array[String]
  ]
  
  trait CreateViewOptions extends StObject {
    
    var checkOption: js.UndefOr[CASCADED | LOCAL] = js.undefined
    
    var columns: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var options: js.UndefOr[ViewOptions] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var temporary: js.UndefOr[Boolean] = js.undefined
  }
  object CreateViewOptions {
    
    inline def apply(): CreateViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateViewOptions]
    }
    
    extension [Self <: CreateViewOptions](x: Self) {
      
      inline def setCheckOption(value: CASCADED | LOCAL): Self = StObject.set(x, "checkOption", value.asInstanceOf[js.Any])
      
      inline def setCheckOptionUndefined: Self = StObject.set(x, "checkOption", js.undefined)
      
      inline def setColumns(value: String | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setOptions(value: ViewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
  
  type DropView = js.Function2[
    /* viewName */ Name, 
    /* options */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameView extends RenameViewFn {
    
    def reverse(viewName: Name, newViewName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameViewFn = js.native
  }
  
  type RenameViewFn = js.Function2[/* viewName */ Name, /* newViewName */ Name, String | js.Array[String]]
  
  type ViewOptions = StringDictionary[Boolean | Double | String]
}
