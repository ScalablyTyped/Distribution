package typings.nginstackEngine

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appendRecordsMod {
  
  inline def apply(ds: Any, records: js.Array[Record[Any, Any]]): Unit = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], records.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(ds: Any, records: js.Array[Record[Any, Any]], opt_post: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], records.asInstanceOf[js.Any], opt_post.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(ds: Any, records: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], records.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(ds: Any, records: Record[Any, Any], opt_post: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], records.asInstanceOf[js.Any], opt_post.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/testing/dataset/appendRecords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
