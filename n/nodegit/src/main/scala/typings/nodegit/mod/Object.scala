package typings.nodegit.mod

import typings.nodegit.objectMod.Object.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Object")
@js.native
class Object ()
  extends typings.nodegit.objectMod.Object
/* static members */
object Object {
  
  @JSImport("nodegit", "Object")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, `type`: TYPE): js.Promise[typings.nodegit.objectMod.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.objectMod.Object]]
  
  @scala.inline
  def lookupPrefix(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.oidMod.Oid,
    len: Double,
    `type`: TYPE
  ): js.Promise[typings.nodegit.objectMod.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.objectMod.Object]]
  
  @scala.inline
  def size(`type`: TYPE): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def string2Type(str: String): TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("string2Type")(str.asInstanceOf[js.Any]).asInstanceOf[TYPE]
  
  @scala.inline
  def type2String(`type`: TYPE): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type2String")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def typeisloose(`type`: TYPE): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("typeisloose")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
}
