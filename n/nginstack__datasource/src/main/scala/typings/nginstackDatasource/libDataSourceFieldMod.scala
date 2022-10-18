package typings.nginstackDatasource

import org.scalablytyped.runtime.StringDictionary
import typings.nginstackDatasource.anon.ANGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSourceFieldMod {
  
  inline def apply(name: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceField", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSourceField {
    def this(name: String, `type`: String) = this()
  }
  @JSImport("@nginstack/datasource/lib/DataSourceField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/datasource/lib/DataSourceField", "PREFIX_SEPARATOR")
  @js.native
  val PREFIX_SEPARATOR: String = js.native
  
  @js.native
  trait DataSourceField extends StObject {
    
    def assignFrom(src: StringDictionary[Any]): Unit = js.native
    def assignFrom(src: DataSourceField): Unit = js.native
    
    /* protected */ var baseLabelSuffix_ : String = js.native
    
    /* protected */ var base_ : DataSourceField = js.native
    
    var classKey: Double | Null = js.native
    
    var help: String = js.native
    
    def isCombo(): Boolean = js.native
    
    def isDate(): Boolean = js.native
    
    def isInteger(): Boolean = js.native
    
    var label: String = js.native
    
    var lookupType: Double = js.native
    
    var lowerName: String = js.native
    
    var name: String = js.native
    
    /* protected */ def notifyNameChange_(name: String): Unit = js.native
    
    var options: js.Array[Any] = js.native
    
    /* protected */ var propertiesToAssign_ : js.Array[String] = js.native
    
    /* private */ var shared: Any = js.native
    
    var stringIfTrue: String = js.native
    
    var `type`: ANGLE = js.native
    
    def unshare(): DataSourceField = js.native
    
    var upperName: String = js.native
  }
}
