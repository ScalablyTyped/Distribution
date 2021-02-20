package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.anon.ReverseCreateViewFn
import typings.nodePgMigrate.anon.ReverseRenameViewFn
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.CASCADED
import typings.nodePgMigrate.nodePgMigrateStrings.LOCAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsTypesMod {
  
  type AlterView = js.Function2[/* viewName */ Name, /* options */ AlterViewOptions, String | js.Array[String]]
  
  type AlterViewColumn = js.Function3[
    /* viewName */ Name, 
    /* columnName */ String, 
    /* options */ AlterViewColumnOptions, 
    String | js.Array[String]
  ]
  
  @js.native
  trait AlterViewColumnOptions extends StObject {
    
    var default: js.UndefOr[Value] = js.native
  }
  object AlterViewColumnOptions {
    
    @scala.inline
    def apply(): AlterViewColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterViewColumnOptions]
    }
    
    @scala.inline
    implicit class AlterViewColumnOptionsMutableBuilder[Self <: AlterViewColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "default", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AlterViewOptions extends StObject {
    
    var checkOption: js.UndefOr[Null | CASCADED | LOCAL] = js.native
    
    var options: js.UndefOr[js.Object] = js.native
  }
  object AlterViewOptions {
    
    @scala.inline
    def apply(): AlterViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterViewOptions]
    }
    
    @scala.inline
    implicit class AlterViewOptionsMutableBuilder[Self <: AlterViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckOption(value: CASCADED | LOCAL): Self = StObject.set(x, "checkOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckOptionNull: Self = StObject.set(x, "checkOption", null)
      
      @scala.inline
      def setCheckOptionUndefined: Self = StObject.set(x, "checkOption", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type CreateView = CreateViewFn with ReverseCreateViewFn
  
  type CreateViewFn = js.Function3[
    /* viewName */ Name, 
    /* options */ CreateViewOptions with DropOptions, 
    /* definition */ String, 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateViewOptions extends StObject {
    
    var checkOption: js.UndefOr[CASCADED | LOCAL] = js.native
    
    var columns: js.UndefOr[String | js.Array[String]] = js.native
    
    var options: js.UndefOr[ViewOptions] = js.native
    
    var recursive: js.UndefOr[Boolean] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var temporary: js.UndefOr[Boolean] = js.native
  }
  object CreateViewOptions {
    
    @scala.inline
    def apply(): CreateViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateViewOptions]
    }
    
    @scala.inline
    implicit class CreateViewOptionsMutableBuilder[Self <: CreateViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckOption(value: CASCADED | LOCAL): Self = StObject.set(x, "checkOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckOptionUndefined: Self = StObject.set(x, "checkOption", js.undefined)
      
      @scala.inline
      def setColumns(value: String | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: ViewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
  
  type DropView = js.Function2[
    /* viewName */ Name, 
    /* options */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type RenameView = RenameViewFn with ReverseRenameViewFn
  
  type RenameViewFn = js.Function2[/* viewName */ Name, /* newViewName */ Name, String | js.Array[String]]
  
  type ViewOptions = StringDictionary[Boolean | Double | String]
}
