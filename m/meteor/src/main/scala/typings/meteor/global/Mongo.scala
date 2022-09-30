package typings.meteor.global

import typings.meteor.Mongo.Collection
import typings.meteor.Mongo.CollectionStatic
import typings.meteor.Mongo.Cursor
import typings.meteor.Mongo.CursorStatic
import typings.meteor.Mongo.ObjectID
import typings.meteor.Mongo.ObjectIDStatic
import typings.meteor.anon.IdGeneration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mongo {
  
  @JSGlobal("Mongo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Mongo.Collection")
  @js.native
  def Collection: CollectionStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Mongo.Collection")
  @js.native
  /**
    * Constructor for a Collection
    * @param name The name of the collection. If null, creates an unmanaged (unsynchronized) local collection.
    */
  open class CollectionCls[T, U] ()
    extends StObject
       with Collection[T, U] {
    def this(name: String) = this()
    def this(name: String, options: IdGeneration[T, U]) = this()
    def this(name: Null, options: IdGeneration[T, U]) = this()
  }
  
  inline def Collection_=(x: CollectionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Mongo.Cursor")
  @js.native
  def Cursor: CursorStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Mongo.Cursor")
  @js.native
  /**
    * To create a cursor, use find. To access the documents in a cursor, use forEach, map, or fetch.
    */
  open class CursorCls[T, U] ()
    extends StObject
       with Cursor[T, U]
  
  inline def Cursor_=(x: CursorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cursor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Mongo.ObjectID")
  @js.native
  def ObjectID: ObjectIDStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Mongo.ObjectID")
  @js.native
  /**
    * Create a Mongo-style `ObjectID`.  If you don't specify a `hexString`, the `ObjectID` will generated randomly (not using MongoDB's ID construction rules).
    * @param hexString The 24-character hexadecimal contents of the ObjectID to create
    */
  open class ObjectIDCls ()
    extends StObject
       with ObjectID {
    def this(hexString: String) = this()
    
    /* CompleteClass */
    override def equals(otherID: ObjectID): Boolean = js.native
    
    /* CompleteClass */
    override def toHexString(): String = js.native
  }
  
  inline def ObjectID_=(x: ObjectIDStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectID")(x.asInstanceOf[js.Any])
  
  inline def setConnectionOptions(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConnectionOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
