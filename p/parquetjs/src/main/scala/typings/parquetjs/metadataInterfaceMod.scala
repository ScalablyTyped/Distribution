package typings.parquetjs

import typings.nodeInt64.mod.^
import typings.parquetjs.anon.Codec
import typings.parquetjs.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataInterfaceMod {
  
  @js.native
  trait MetadataInterface extends StObject {
    
    var created_by: String = js.native
    
    var key_value_metadata: js.Array[Key] = js.native
    
    var num_rows: ^ = js.native
    
    var row_groups: js.Array[MetadataRowGroupsInterface] = js.native
    
    var schema: js.Array[MetadataSchemaInterface] = js.native
    
    var version: Double = js.native
  }
  object MetadataInterface {
    
    @scala.inline
    def apply(
      created_by: String,
      key_value_metadata: js.Array[Key],
      num_rows: ^,
      row_groups: js.Array[MetadataRowGroupsInterface],
      schema: js.Array[MetadataSchemaInterface],
      version: Double
    ): MetadataInterface = {
      val __obj = js.Dynamic.literal(created_by = created_by.asInstanceOf[js.Any], key_value_metadata = key_value_metadata.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], row_groups = row_groups.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataInterface]
    }
    
    @scala.inline
    implicit class MetadataInterfaceMutableBuilder[Self <: MetadataInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey_value_metadata(value: js.Array[Key]): Self = StObject.set(x, "key_value_metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey_value_metadataVarargs(value: Key*): Self = StObject.set(x, "key_value_metadata", js.Array(value :_*))
      
      @scala.inline
      def setNum_rows(value: ^): Self = StObject.set(x, "num_rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow_groups(value: js.Array[MetadataRowGroupsInterface]): Self = StObject.set(x, "row_groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow_groupsVarargs(value: MetadataRowGroupsInterface*): Self = StObject.set(x, "row_groups", js.Array(value :_*))
      
      @scala.inline
      def setSchema(value: js.Array[MetadataSchemaInterface]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaVarargs(value: MetadataSchemaInterface*): Self = StObject.set(x, "schema", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetadataRowGroupsColumnsInterface extends StObject {
    
    var file_offset: ^ = js.native
    
    var file_path: String | Null = js.native
    
    var meta_data: Codec = js.native
  }
  object MetadataRowGroupsColumnsInterface {
    
    @scala.inline
    def apply(file_offset: ^, meta_data: Codec): MetadataRowGroupsColumnsInterface = {
      val __obj = js.Dynamic.literal(file_offset = file_offset.asInstanceOf[js.Any], meta_data = meta_data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataRowGroupsColumnsInterface]
    }
    
    @scala.inline
    implicit class MetadataRowGroupsColumnsInterfaceMutableBuilder[Self <: MetadataRowGroupsColumnsInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile_offset(value: ^): Self = StObject.set(x, "file_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_path(value: String): Self = StObject.set(x, "file_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_pathNull: Self = StObject.set(x, "file_path", null)
      
      @scala.inline
      def setMeta_data(value: Codec): Self = StObject.set(x, "meta_data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetadataRowGroupsInterface extends StObject {
    
    var columns: js.Array[MetadataRowGroupsColumnsInterface] = js.native
    
    var num_rows: ^ = js.native
    
    var sorting_columns: (js.Array[js.Array[String] | String]) | Null = js.native
    
    var total_byte_size: ^ = js.native
  }
  object MetadataRowGroupsInterface {
    
    @scala.inline
    def apply(columns: js.Array[MetadataRowGroupsColumnsInterface], num_rows: ^, total_byte_size: ^): MetadataRowGroupsInterface = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataRowGroupsInterface]
    }
    
    @scala.inline
    implicit class MetadataRowGroupsInterfaceMutableBuilder[Self <: MetadataRowGroupsInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[MetadataRowGroupsColumnsInterface]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: MetadataRowGroupsColumnsInterface*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setNum_rows(value: ^): Self = StObject.set(x, "num_rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorting_columns(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "sorting_columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorting_columnsNull: Self = StObject.set(x, "sorting_columns", null)
      
      @scala.inline
      def setSorting_columnsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "sorting_columns", js.Array(value :_*))
      
      @scala.inline
      def setTotal_byte_size(value: ^): Self = StObject.set(x, "total_byte_size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetadataSchemaInterface extends StObject {
    
    var converted_type: String | Null = js.native
    
    var field_id: Double | Null = js.native
    
    var name: String = js.native
    
    var num_children: Double | Null = js.native
    
    var precision: Double | Null = js.native
    
    var repetition_type: String | Null = js.native
    
    var scale: Double | Null = js.native
    
    var `type`: Double | Null = js.native
    
    var type_length: Double | Null = js.native
  }
  object MetadataSchemaInterface {
    
    @scala.inline
    def apply(name: String): MetadataSchemaInterface = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataSchemaInterface]
    }
    
    @scala.inline
    implicit class MetadataSchemaInterfaceMutableBuilder[Self <: MetadataSchemaInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverted_type(value: String): Self = StObject.set(x, "converted_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverted_typeNull: Self = StObject.set(x, "converted_type", null)
      
      @scala.inline
      def setField_id(value: Double): Self = StObject.set(x, "field_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField_idNull: Self = StObject.set(x, "field_id", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_children(value: Double): Self = StObject.set(x, "num_children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_childrenNull: Self = StObject.set(x, "num_children", null)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionNull: Self = StObject.set(x, "precision", null)
      
      @scala.inline
      def setRepetition_type(value: String): Self = StObject.set(x, "repetition_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepetition_typeNull: Self = StObject.set(x, "repetition_type", null)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleNull: Self = StObject.set(x, "scale", null)
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setType_length(value: Double): Self = StObject.set(x, "type_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType_lengthNull: Self = StObject.set(x, "type_length", null)
    }
  }
}
