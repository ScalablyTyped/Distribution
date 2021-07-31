package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.ASC
import typings.nodePgMigrate.nodePgMigrateStrings.DESC
import typings.nodePgMigrate.nodePgMigrateStrings.btree
import typings.nodePgMigrate.nodePgMigrateStrings.gin
import typings.nodePgMigrate.nodePgMigrateStrings.gist
import typings.nodePgMigrate.nodePgMigrateStrings.hash
import typings.nodePgMigrate.nodePgMigrateStrings.spgist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexesTypesMod {
  
  @js.native
  trait CreateIndex extends CreateIndexFn {
    
    def reverse(tableName: Name, columns: String): String | js.Array[String] = js.native
    def reverse(tableName: Name, columns: String, options: CreateIndexOptions & DropIndexOptions): String | js.Array[String] = js.native
    def reverse(tableName: Name, columns: js.Array[String | IndexColumn]): String | js.Array[String] = js.native
    def reverse(
      tableName: Name,
      columns: js.Array[String | IndexColumn],
      options: CreateIndexOptions & DropIndexOptions
    ): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateIndexFn = js.native
  }
  
  type CreateIndexFn = js.Function3[
    /* tableName */ Name, 
    /* columns */ String | (js.Array[String | IndexColumn]), 
    /* options */ js.UndefOr[CreateIndexOptions & DropIndexOptions], 
    String | js.Array[String]
  ]
  
  trait CreateIndexOptions extends StObject {
    
    var concurrently: js.UndefOr[Boolean] = js.undefined
    
    var ifNotExists: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var method: js.UndefOr[btree | hash | gist | spgist | gin] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated should be parameter of IndexColumn
      */
    var opclass: js.UndefOr[Name] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
    
    var where: js.UndefOr[String] = js.undefined
  }
  object CreateIndexOptions {
    
    @scala.inline
    def apply(): CreateIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateIndexOptions]
    }
    
    @scala.inline
    implicit class CreateIndexOptionsMutableBuilder[Self <: CreateIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrently(value: Boolean): Self = StObject.set(x, "concurrently", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentlyUndefined: Self = StObject.set(x, "concurrently", js.undefined)
      
      @scala.inline
      def setIfNotExists(value: Boolean): Self = StObject.set(x, "ifNotExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfNotExistsUndefined: Self = StObject.set(x, "ifNotExists", js.undefined)
      
      @scala.inline
      def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: btree | hash | gist | spgist | gin): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpclass(value: Name): Self = StObject.set(x, "opclass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpclassUndefined: Self = StObject.set(x, "opclass", js.undefined)
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      @scala.inline
      def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
  
  type DropIndex = js.Function3[
    /* tableName */ Name, 
    /* columns */ String | (js.Array[String | IndexColumn]), 
    /* options */ js.UndefOr[DropIndexOptions], 
    String | js.Array[String]
  ]
  
  trait DropIndexOptions
    extends StObject
       with DropOptions {
    
    var concurrently: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object DropIndexOptions {
    
    @scala.inline
    def apply(): DropIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropIndexOptions]
    }
    
    @scala.inline
    implicit class DropIndexOptionsMutableBuilder[Self <: DropIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrently(value: Boolean): Self = StObject.set(x, "concurrently", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentlyUndefined: Self = StObject.set(x, "concurrently", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait IndexColumn extends StObject {
    
    var name: String
    
    var opclass: js.UndefOr[Name] = js.undefined
    
    var sort: js.UndefOr[ASC | DESC] = js.undefined
  }
  object IndexColumn {
    
    @scala.inline
    def apply(name: String): IndexColumn = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexColumn]
    }
    
    @scala.inline
    implicit class IndexColumnMutableBuilder[Self <: IndexColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpclass(value: Name): Self = StObject.set(x, "opclass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpclassUndefined: Self = StObject.set(x, "opclass", js.undefined)
      
      @scala.inline
      def setSort(value: ASC | DESC): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
