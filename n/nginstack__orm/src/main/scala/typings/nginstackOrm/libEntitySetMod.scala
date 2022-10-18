package typings.nginstackOrm

import typings.nginstackOrm.anon.Inserted
import typings.nginstackOrm.anon.UserKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntitySetMod {
  
  inline def apply(baseClass: Double, dataSet: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(baseClass.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(baseClass: Double, dataSet: Any, opt_options: EntitySetOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(baseClass.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(baseClass: Double, dataSet: Any, opt_options: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(baseClass.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/orm/lib/EntitySet", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EntitySet {
    def this(baseClass: Double, dataSet: Any) = this()
    def this(baseClass: Double, dataSet: Any, opt_options: EntitySetOptions) = this()
    def this(baseClass: Double, dataSet: Any, opt_options: Record[Any, Any]) = this()
  }
  @JSImport("@nginstack/orm/lib/EntitySet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromClass(classKey: Double): EntitySet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromClass")(classKey.asInstanceOf[js.Any]).asInstanceOf[EntitySet]
  inline def fromClass(classKey: Double, opt_options: UserKey): EntitySet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromClass")(classKey.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[EntitySet]
  inline def fromClass(classKey: Double, opt_options: Record[Any, Any]): EntitySet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromClass")(classKey.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[EntitySet]
  
  inline def fromDataSet(baseClass: Double, dataSet: Any): EntitySet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDataSet")(baseClass.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[EntitySet]
  inline def fromDataSet(baseClass: Double, dataSet: Any, opt_options: UserKey): EntitySet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDataSet")(baseClass.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[EntitySet]
  inline def fromDataSet(baseClass: Double, dataSet: Any, opt_options: Record[Any, Any]): EntitySet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDataSet")(baseClass.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[EntitySet]
  
  inline def persist(entitySets: js.Array[EntitySet]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("persist")(entitySets.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def persist(entitySets: EntitySet): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("persist")(entitySets.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type DataSet = Any
  
  @js.native
  trait EntitySet extends StObject {
    
    var autoPersist: Boolean = js.native
    
    /* private */ var autoPersist_ : Any = js.native
    
    var baseClass: Double = js.native
    
    /* private */ var baseClass_ : Any = js.native
    
    def bindDataSet(dataSet: Any): Unit = js.native
    
    /* private */ var classFieldIndex_ : Any = js.native
    
    /* private */ var classFieldName_ : Any = js.native
    
    /* private */ var customModelDef_ : Any = js.native
    
    /* private */ var dataSet_ : Any = js.native
    
    /* private */ var entityCache_ : Any = js.native
    
    /* private */ var fields_ : Any = js.native
    
    def findByKey(key: Double): typings.nginstackOrm.libEntityMod.^ = js.native
    
    def forEach(callback: js.Function1[/* arg0 */ typings.nginstackOrm.libEntityMod.^, Any]): Unit = js.native
    def forEach(callback: js.Function1[/* arg0 */ typings.nginstackOrm.libEntityMod.^, Any], opt_context: Any): Unit = js.native
    
    /* private */ var getCachedEntity_ : Any = js.native
    
    def insert(data: Record[Any, Any]): Double = js.native
    
    /* private */ var items_ : Any = js.native
    
    /* private */ var keyFieldIndex_ : Any = js.native
    
    /* private */ var keyFieldName_ : Any = js.native
    
    def merge(data: js.Array[Any]): Inserted = js.native
    def merge(data: Record[Any, Any]): Inserted = js.native
    
    def newEntity(data: Double): typings.nginstackOrm.libEntityMod.^ = js.native
    def newEntity(data: Record[Any, Any]): typings.nginstackOrm.libEntityMod.^ = js.native
    
    def persist(): Double = js.native
    
    def remove(entity: Double): Unit = js.native
    def remove(entity: typings.nginstackOrm.libEntityMod.^): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def some(callback: js.Function1[/* arg0 */ typings.nginstackOrm.libEntityMod.^, Boolean]): Boolean = js.native
    def some(callback: js.Function1[/* arg0 */ typings.nginstackOrm.libEntityMod.^, Boolean], opt_context: Any): Boolean = js.native
    
    def toJSONSchema(): Any = js.native
    
    def toJSONString(): String = js.native
    
    def update(key: Double, data: Any): Unit = js.native
    
    /* private */ var userKey_ : Any = js.native
  }
  
  type EntitySetOptions = typings.nginstackOrm.libEntitySetOptionsMod.^
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
  
  type ModelDef = typings.nginstackEngine.libClassdefModelDefMod.^
}
