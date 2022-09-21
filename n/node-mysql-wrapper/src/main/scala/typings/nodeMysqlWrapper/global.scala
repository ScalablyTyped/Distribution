package typings.nodeMysqlWrapper

import typings.nodeMysqlWrapper.Mongo.Collection
import typings.nodeMysqlWrapper.Mongo.CollectionStatic
import typings.nodeMysqlWrapper.Mongo.Cursor
import typings.nodeMysqlWrapper.Mongo.CursorStatic
import typings.nodeMysqlWrapper.Mongo.ObjectID
import typings.nodeMysqlWrapper.Mongo.ObjectIDStatic
import typings.nodeMysqlWrapper.anon.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Meteor {
    
    @JSGlobal("Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Meteor.isClient")
    @js.native
    def isClient: Boolean = js.native
    inline def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isServer")
    @js.native
    def isServer: Boolean = js.native
    inline def isServer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
  }
  
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
    open class CollectionCls[T] protected ()
      extends StObject
         with Collection[T] {
      def this(name: String) = this()
      def this(name: String, options: Connection) = this()
    }
    
    inline def Collection_=(x: CollectionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.Cursor")
    @js.native
    def Cursor: CursorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Cursor")
    @js.native
    open class CursorCls[T] ()
      extends StObject
         with Cursor[T]
    
    inline def Cursor_=(x: CursorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cursor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.ObjectID")
    @js.native
    def ObjectID: ObjectIDStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.ObjectID")
    @js.native
    open class ObjectIDCls protected ()
      extends StObject
         with ObjectID {
      def this(hexString: String) = this()
    }
    
    inline def ObjectID_=(x: ObjectIDStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectID")(x.asInstanceOf[js.Any])
  }
}
