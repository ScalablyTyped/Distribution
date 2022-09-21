package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "OCluster")
@js.native
open class OCluster () extends StObject {
  
  def cacheData(clusters: js.Array[OCluster] & js.Array[Any]): ODB = js.native
  
  def count(name: String): js.Promise[Double] = js.native
  
  def create(name: String): js.Promise[OCluster] & js.Promise[Any] = js.native
  def create(name: String, location: String): js.Promise[OCluster] & js.Promise[Any] = js.native
  
  def drop(name: String): js.Promise[ODB] = js.native
  
  def get(nameOrId: String): js.Promise[OCluster] & js.Promise[Any] = js.native
  def get(nameOrId: String, refresh: Boolean): js.Promise[OCluster] & js.Promise[Any] = js.native
  
  def getById(id: String): js.Promise[OCluster] & js.Promise[Any] = js.native
  def getById(id: String, refresh: Boolean): js.Promise[OCluster] & js.Promise[Any] = js.native
  
  def getByName(name: String): js.Promise[OCluster] & js.Promise[Any] = js.native
  def getByName(name: String, refresh: Boolean): js.Promise[OCluster] & js.Promise[Any] = js.native
  
  def list(): js.Promise[js.Array[Any]] = js.native
  def list(refresh: Boolean): js.Promise[js.Array[Any]] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  def range(name: String): js.Promise[Any] = js.native
}
