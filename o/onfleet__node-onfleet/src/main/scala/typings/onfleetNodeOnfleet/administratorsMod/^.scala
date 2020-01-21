package typings.onfleetNodeOnfleet.administratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@onfleet/node-onfleet/Resources/Administrators", JSImport.Namespace)
@js.native
class ^ () extends Admin {
  /* CompleteClass */
  override def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin] = js.native
  /* CompleteClass */
  override def deleteOne(id: String): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(): js.Promise[js.Array[OnfleetAdmin]] = js.native
  /* CompleteClass */
  override def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin] = js.native
}

