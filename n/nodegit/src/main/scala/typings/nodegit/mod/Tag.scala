package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tag")
@js.native
class Tag ()
  extends typings.nodegit.tagMod.Tag
/* static members */
object Tag {
  
  @JSImport("nodegit", "Tag.annotationCreate")
  @js.native
  def annotationCreate(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    tagger: typings.nodegit.signatureMod.Signature,
    message: String
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Tag.create")
  @js.native
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    tagger: typings.nodegit.signatureMod.Signature,
    message: String,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Tag.createLightweight")
  @js.native
  def createLightweight(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Tag.delete")
  @js.native
  def delete(repo: typings.nodegit.repositoryMod.Repository, tagName: String): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Tag.list")
  @js.native
  def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  
  @JSImport("nodegit", "Tag.listMatch")
  @js.native
  def listMatch(tagNames: String, pattern: String, repo: typings.nodegit.repositoryMod.Repository): Double = js.native
  @JSImport("nodegit", "Tag.listMatch")
  @js.native
  def listMatch(tagNames: js.Array[String], pattern: String, repo: typings.nodegit.repositoryMod.Repository): Double = js.native
  @JSImport("nodegit", "Tag.listMatch")
  @js.native
  def listMatch(
    tagNames: typings.nodegit.strArrayMod.Strarray,
    pattern: String,
    repo: typings.nodegit.repositoryMod.Repository
  ): Double = js.native
  
  /**
    * Retrieves the tag pointed to by the oid
    *
    *
    */
  @JSImport("nodegit", "Tag.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.tagMod.Tag] = js.native
  @JSImport("nodegit", "Tag.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.tagMod.Tag] = js.native
  @JSImport("nodegit", "Tag.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.tagMod.Tag): js.Promise[typings.nodegit.tagMod.Tag] = js.native
  
  @JSImport("nodegit", "Tag.lookupPrefix")
  @js.native
  def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.tagMod.Tag] = js.native
}
