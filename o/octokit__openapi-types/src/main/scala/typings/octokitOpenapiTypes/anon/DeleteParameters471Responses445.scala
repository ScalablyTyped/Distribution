package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters471Responses445 extends StObject {
  
  /**
    * Delete a user migration archive
    * @description Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://docs.github.com/rest/migrations/users#list-user-migrations) and [Get a user migration status](https://docs.github.com/rest/migrations/users#get-a-user-migration-status) endpoints, will continue to be available even after an archive is deleted.
    */
  var delete: Parameters471Responses445
  
  /**
    * Download a user migration archive
    * @description Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:
    *
    * *   attachments
    * *   bases
    * *   commit\_comments
    * *   issue\_comments
    * *   issue\_events
    * *   issues
    * *   milestones
    * *   organizations
    * *   projects
    * *   protected\_branches
    * *   pull\_request\_reviews
    * *   pull\_requests
    * *   releases
    * *   repositories
    * *   review\_comments
    * *   schema
    * *   users
    *
    * The archive will also contain an `attachments` directory that includes all attachment files uploaded to GitHub.com and a `repositories` directory that contains the repository's Git data.
    */
  var get: Parameters471
}
object DeleteParameters471Responses445 {
  
  inline def apply(delete: Parameters471Responses445, get: Parameters471): DeleteParameters471Responses445 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters471Responses445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters471Responses445] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters471Responses445): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters471): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
