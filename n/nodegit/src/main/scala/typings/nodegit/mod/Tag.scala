package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tag")
@js.native
class Tag ()
  extends typings.nodegit.tagMod.Tag
/* static members */
object Tag {
  
  @JSImport("nodegit", "Tag")
  @js.native
  val ^ : js.Any = js.native
  
  inline def annotationCreate(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    tagger: typings.nodegit.signatureMod.Signature,
    message: String
  ): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("annotationCreate")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
  
  inline def create(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    tagger: typings.nodegit.signatureMod.Signature,
    message: String,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], tagger.asInstanceOf[js.Any], message.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
  
  inline def createLightweight(
    repo: typings.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typings.nodegit.objectMod.Object,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLightweight")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
  
  inline def delete(repo: typings.nodegit.repositoryMod.Repository, tagName: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  inline def listMatch(tagNames: String, pattern: String, repo: typings.nodegit.repositoryMod.Repository): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listMatch")(tagNames.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], repo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def listMatch(tagNames: js.Array[String], pattern: String, repo: typings.nodegit.repositoryMod.Repository): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listMatch")(tagNames.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], repo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def listMatch(
    tagNames: typings.nodegit.strArrayMod.Strarray,
    pattern: String,
    repo: typings.nodegit.repositoryMod.Repository
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listMatch")(tagNames.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], repo.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Retrieves the tag pointed to by the oid
    *
    *
    */
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.tagMod.Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.tagMod.Tag]]
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.tagMod.Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.tagMod.Tag]]
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.tagMod.Tag): js.Promise[typings.nodegit.tagMod.Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.tagMod.Tag]]
  
  inline def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.tagMod.Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.tagMod.Tag]]
}
