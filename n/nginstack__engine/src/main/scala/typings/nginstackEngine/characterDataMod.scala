package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterDataMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/CharacterData", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CharacterData {
    
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    
    /* CompleteClass */
    var data: String = js.native
    
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    
    /* CompleteClass */
    override val length: Double = js.native
    
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/CharacterData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CharacterData extends StObject {
    
    def appendData(data: String): Unit
    
    var data: String
    
    def deleteData(offset: Double, count: Double): Unit
    
    def insertData(offset: Double, data: String): Unit
    
    val length: Double
    
    def replaceData(offset: Double, count: Double, data: String): Unit
    
    def substringData(offset: Double, count: Double): String
  }
  object CharacterData {
    
    inline def apply(
      appendData: String => Unit,
      data: String,
      deleteData: (Double, Double) => Unit,
      insertData: (Double, String) => Unit,
      length: Double,
      replaceData: (Double, Double, String) => Unit,
      substringData: (Double, Double) => String
    ): CharacterData = {
      val __obj = js.Dynamic.literal(appendData = js.Any.fromFunction1(appendData), data = data.asInstanceOf[js.Any], deleteData = js.Any.fromFunction2(deleteData), insertData = js.Any.fromFunction2(insertData), length = length.asInstanceOf[js.Any], replaceData = js.Any.fromFunction3(replaceData), substringData = js.Any.fromFunction2(substringData))
      __obj.asInstanceOf[CharacterData]
    }
    
    extension [Self <: CharacterData](x: Self) {
      
      inline def setAppendData(value: String => Unit): Self = StObject.set(x, "appendData", js.Any.fromFunction1(value))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDeleteData(value: (Double, Double) => Unit): Self = StObject.set(x, "deleteData", js.Any.fromFunction2(value))
      
      inline def setInsertData(value: (Double, String) => Unit): Self = StObject.set(x, "insertData", js.Any.fromFunction2(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setReplaceData(value: (Double, Double, String) => Unit): Self = StObject.set(x, "replaceData", js.Any.fromFunction3(value))
      
      inline def setSubstringData(value: (Double, Double) => String): Self = StObject.set(x, "substringData", js.Any.fromFunction2(value))
    }
  }
}
