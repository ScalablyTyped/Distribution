package typings.parquetjs

import typings.nodeInt64.mod.^
import typings.parquetjs.anon.Codec
import typings.parquetjs.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMetadataDotinterfaceMod {
  
  trait MetadataInterface extends StObject {
    
    var created_by: String
    
    var key_value_metadata: js.Array[Key]
    
    var num_rows: ^
    
    var row_groups: js.Array[MetadataRowGroupsInterface]
    
    var schema: js.Array[MetadataSchemaInterface]
    
    var version: Double
  }
  object MetadataInterface {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: MetadataInterface] (val x: Self) extends AnyVal {
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setKey_value_metadata(value: js.Array[Key]): Self = StObject.set(x, "key_value_metadata", value.asInstanceOf[js.Any])
      
      inline def setKey_value_metadataVarargs(value: Key*): Self = StObject.set(x, "key_value_metadata", js.Array(value*))
      
      inline def setNum_rows(value: ^): Self = StObject.set(x, "num_rows", value.asInstanceOf[js.Any])
      
      inline def setRow_groups(value: js.Array[MetadataRowGroupsInterface]): Self = StObject.set(x, "row_groups", value.asInstanceOf[js.Any])
      
      inline def setRow_groupsVarargs(value: MetadataRowGroupsInterface*): Self = StObject.set(x, "row_groups", js.Array(value*))
      
      inline def setSchema(value: js.Array[MetadataSchemaInterface]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaVarargs(value: MetadataSchemaInterface*): Self = StObject.set(x, "schema", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataRowGroupsColumnsInterface extends StObject {
    
    var file_offset: ^
    
    var file_path: String | Null
    
    var meta_data: Codec
  }
  object MetadataRowGroupsColumnsInterface {
    
    inline def apply(file_offset: ^, meta_data: Codec): MetadataRowGroupsColumnsInterface = {
      val __obj = js.Dynamic.literal(file_offset = file_offset.asInstanceOf[js.Any], meta_data = meta_data.asInstanceOf[js.Any], file_path = null)
      __obj.asInstanceOf[MetadataRowGroupsColumnsInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataRowGroupsColumnsInterface] (val x: Self) extends AnyVal {
      
      inline def setFile_offset(value: ^): Self = StObject.set(x, "file_offset", value.asInstanceOf[js.Any])
      
      inline def setFile_path(value: String): Self = StObject.set(x, "file_path", value.asInstanceOf[js.Any])
      
      inline def setFile_pathNull: Self = StObject.set(x, "file_path", null)
      
      inline def setMeta_data(value: Codec): Self = StObject.set(x, "meta_data", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataRowGroupsInterface extends StObject {
    
    var columns: js.Array[MetadataRowGroupsColumnsInterface]
    
    var num_rows: ^
    
    var sorting_columns: (js.Array[js.Array[String] | String]) | Null
    
    var total_byte_size: ^
  }
  object MetadataRowGroupsInterface {
    
    inline def apply(columns: js.Array[MetadataRowGroupsColumnsInterface], num_rows: ^, total_byte_size: ^): MetadataRowGroupsInterface = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any], sorting_columns = null)
      __obj.asInstanceOf[MetadataRowGroupsInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataRowGroupsInterface] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[MetadataRowGroupsColumnsInterface]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: MetadataRowGroupsColumnsInterface*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setNum_rows(value: ^): Self = StObject.set(x, "num_rows", value.asInstanceOf[js.Any])
      
      inline def setSorting_columns(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "sorting_columns", value.asInstanceOf[js.Any])
      
      inline def setSorting_columnsNull: Self = StObject.set(x, "sorting_columns", null)
      
      inline def setSorting_columnsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "sorting_columns", js.Array(value*))
      
      inline def setTotal_byte_size(value: ^): Self = StObject.set(x, "total_byte_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataSchemaInterface extends StObject {
    
    var converted_type: String | Null
    
    var field_id: Double | Null
    
    var name: String
    
    var num_children: Double | Null
    
    var precision: Double | Null
    
    var repetition_type: String | Null
    
    var scale: Double | Null
    
    var `type`: Double | Null
    
    var type_length: Double | Null
  }
  object MetadataSchemaInterface {
    
    inline def apply(name: String): MetadataSchemaInterface = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], converted_type = null, field_id = null, num_children = null, precision = null, repetition_type = null, scale = null, type_length = null)
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[MetadataSchemaInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataSchemaInterface] (val x: Self) extends AnyVal {
      
      inline def setConverted_type(value: String): Self = StObject.set(x, "converted_type", value.asInstanceOf[js.Any])
      
      inline def setConverted_typeNull: Self = StObject.set(x, "converted_type", null)
      
      inline def setField_id(value: Double): Self = StObject.set(x, "field_id", value.asInstanceOf[js.Any])
      
      inline def setField_idNull: Self = StObject.set(x, "field_id", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNum_children(value: Double): Self = StObject.set(x, "num_children", value.asInstanceOf[js.Any])
      
      inline def setNum_childrenNull: Self = StObject.set(x, "num_children", null)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
      
      inline def setRepetition_type(value: String): Self = StObject.set(x, "repetition_type", value.asInstanceOf[js.Any])
      
      inline def setRepetition_typeNull: Self = StObject.set(x, "repetition_type", null)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleNull: Self = StObject.set(x, "scale", null)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setType_length(value: Double): Self = StObject.set(x, "type_length", value.asInstanceOf[js.Any])
      
      inline def setType_lengthNull: Self = StObject.set(x, "type_length", null)
    }
  }
}
