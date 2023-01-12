package typings.nrwlDevkit

import typings.nrwlDevkit.srcUtilsStringChangeMod.ChangeType.Delete
import typings.nrwlDevkit.srcUtilsStringChangeMod.ChangeType.Insert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsStringChangeMod {
  
  @JSImport("@nrwl/devkit/src/utils/string-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ChangeType extends StObject
  @JSImport("@nrwl/devkit/src/utils/string-change", "ChangeType")
  @js.native
  object ChangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChangeType & String] = js.native
    
    @js.native
    sealed trait Delete
      extends StObject
         with ChangeType
    /* "Delete" */ val Delete: typings.nrwlDevkit.srcUtilsStringChangeMod.ChangeType.Delete & String = js.native
    
    @js.native
    sealed trait Insert
      extends StObject
         with ChangeType
    /* "Insert" */ val Insert: typings.nrwlDevkit.srcUtilsStringChangeMod.ChangeType.Insert & String = js.native
  }
  
  inline def applyChangesToString(text: String, changes: js.Array[StringChange]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChangesToString")(text.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nrwlDevkit.srcUtilsStringChangeMod.StringInsertion
    - typings.nrwlDevkit.srcUtilsStringChangeMod.StringDeletion
  */
  trait StringChange extends StObject
  object StringChange {
    
    inline def StringDeletion(length: Double, start: Double, `type`: Delete): typings.nrwlDevkit.srcUtilsStringChangeMod.StringDeletion = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nrwlDevkit.srcUtilsStringChangeMod.StringDeletion]
    }
    
    inline def StringInsertion(index: Double, text: String, `type`: Insert): typings.nrwlDevkit.srcUtilsStringChangeMod.StringInsertion = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nrwlDevkit.srcUtilsStringChangeMod.StringInsertion]
    }
  }
  
  trait StringDeletion
    extends StObject
       with StringChange {
    
    /**
      * Number of characters to delete
      */
    var length: Double
    
    /**
      * Place in the original text to start deleting characters
      */
    var start: Double
    
    var `type`: Delete
  }
  object StringDeletion {
    
    inline def apply(length: Double, start: Double, `type`: Delete): StringDeletion = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringDeletion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringDeletion] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: Delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringInsertion
    extends StObject
       with StringChange {
    
    /**
      * Place in the original text to insert new text
      */
    var index: Double
    
    /**
      * Text to insert into the original text
      */
    var text: String
    
    var `type`: Insert
  }
  object StringInsertion {
    
    inline def apply(index: Double, text: String, `type`: Insert): StringInsertion = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringInsertion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringInsertion] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: Insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
