package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImport extends js.Object {
  /**
    * Stop an import for a repository.
    */
  @JSName("cancelImport")
  var cancelImport_Original: `207` = js.native
  /**
    * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://developer.github.com/v3/migrations/users/#list-user-migrations) and [Get a user migration status](https://developer.github.com/v3/migrations/users/#get-a-user-migration-status) endpoints, will continue to be available even after an archive is deleted.
    */
  @JSName("deleteArchiveForAuthenticatedUser")
  var deleteArchiveForAuthenticatedUser_Original: `208` = js.native
  /**
    * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  @JSName("deleteArchiveForOrg")
  var deleteArchiveForOrg_Original: `209` = js.native
  /**
    * Fetches the URL to a migration archive.
    */
  @JSName("downloadArchiveForOrg")
  var downloadArchiveForOrg_Original: `210` = js.native
  /**
    * Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:
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
  @JSName("getArchiveForAuthenticatedUser")
  var getArchiveForAuthenticatedUser_Original: `211` = js.native
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This endpoint and the [Map a commit author](https://developer.github.com/v3/migrations/source_imports/#map-a-commit-author) endpoint allow you to provide correct Git author information.
    */
  @JSName("getCommitAuthors")
  var getCommitAuthors_Original: `212` = js.native
  /**
    * View the progress of an import.
    *
    * **Import status**
    *
    * This section includes details about the possible values of the `status` field of the Import Progress response.
    *
    * An import that does not have errors will progress through these steps:
    *
    * *   `detecting` - the "detection" step of the import is in progress because the request did not include a `vcs` parameter. The import is identifying the type of source control present at the URL.
    * *   `importing` - the "raw" step of the import is in progress. This is where commit data is fetched from the original repository. The import progress response will include `commit_count` (the total number of raw commits that will be imported) and `percent` (0 - 100, the current progress through the import).
    * *   `mapping` - the "rewrite" step of the import is in progress. This is where SVN branches are converted to Git branches, and where author updates are applied. The import progress response does not include progress information.
    * *   `pushing` - the "push" step of the import is in progress. This is where the importer updates the repository on GitHub. The import progress response will include `push_percent`, which is the percent value reported by `git push` when it is "Writing objects".
    * *   `complete` - the import is complete, and the repository is ready on GitHub.
    *
    * If there are problems, you will see one of these in the `status` field:
    *
    * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update an import](https://developer.github.com/v3/migrations/source_imports/#update-an-import) section.
    * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an error message. Contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com) for more information.
    * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update an import](https://developer.github.com/v3/migrations/source_imports/#update-an-import) section.
    * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel the import](https://developer.github.com/v3/migrations/source_imports/#cancel-an-import) and [retry](https://developer.github.com/v3/migrations/source_imports/#start-an-import) with the correct URL.
    * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a `project_choices` field with the possible project choices as values. To update project choice, please see the [Update an import](https://developer.github.com/v3/migrations/source_imports/#update-an-import) section.
    *
    * **The project_choices field**
    *
    * When multiple projects are found at the provided URL, the response hash will include a `project_choices` field, the value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project hashes will differ depending on the version control type.
    *
    * **Git LFS related fields**
    *
    * This section includes details about Git LFS related fields that may be present in the Import Progress response.
    *
    * *   `use_lfs` - describes whether the import has been opted in or out of using Git LFS. The value can be `opt_in`, `opt_out`, or `undecided` if no action has been taken.
    * *   `has_large_files` - the boolean value describing whether files larger than 100MB were found during the `importing` step.
    * *   `large_files_size` - the total size in gigabytes of files larger than 100MB found in the originating repository.
    * *   `large_files_count` - the total number of files larger than 100MB found in the originating repository. To see a list of these files, make a "Get Large Files" request.
    */
  @JSName("getImportStatus")
  var getImportStatus_Original: `213` = js.native
  /**
    * List files larger than 100MB found during the import
    */
  @JSName("getLargeFiles")
  var getLargeFiles_Original: `214` = js.native
  /**
    * Fetches a single user migration. The response includes the `state` of the migration, which can be one of the following values:
    *
    * *   `pending` - the migration hasn't started yet.
    * *   `exporting` - the migration is in progress.
    * *   `exported` - the migration finished successfully.
    * *   `failed` - the migration failed.
    *
    * Once the migration has been `exported` you can [download the migration archive](https://developer.github.com/v3/migrations/users/#download-a-user-migration-archive).
    */
  @JSName("getStatusForAuthenticatedUser")
  var getStatusForAuthenticatedUser_Original: `215` = js.native
  /**
    * Fetches the status of a migration.
    *
    * The `state` of a migration can be one of the following values:
    *
    * *   `pending`, which means the migration hasn't started yet.
    * *   `exporting`, which means the migration is in progress.
    * *   `exported`, which means the migration finished successfully.
    * *   `failed`, which means the migration failed.
    */
  @JSName("getStatusForOrg")
  var getStatusForOrg_Original: `216` = js.native
  /**
    * Lists all migrations a user has started.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: `217` = js.native
  /**
    * Lists the most recent migrations.
    */
  @JSName("listForOrg")
  var listForOrg_Original: `218` = js.native
  /**
    * List all the repositories for this organization migration.
    */
  @JSName("listReposForOrg")
  var listReposForOrg_Original: `219` = js.native
  /**
    * Lists all the repositories for this user migration.
    */
  @JSName("listReposForUser")
  var listReposForUser_Original: `220` = js.native
  /**
    * Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository.
    */
  @JSName("mapCommitAuthor")
  var mapCommitAuthor_Original: `221` = js.native
  /**
    * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://docs.github.com/articles/versioning-large-files/).
    */
  @JSName("setLfsPreference")
  var setLfsPreference_Original: `222` = js.native
  /**
    * Initiates the generation of a user migration archive.
    */
  @JSName("startForAuthenticatedUser")
  var startForAuthenticatedUser_Original: `223` = js.native
  /**
    * Initiates the generation of a migration archive.
    */
  @JSName("startForOrg")
  var startForOrg_Original: `224` = js.native
  /**
    * Start a source import to a GitHub repository using GitHub Importer.
    */
  @JSName("startImport")
  var startImport_Original: `225` = js.native
  /**
    * Unlocks a repository. You can lock repositories when you [start a user migration](https://developer.github.com/v3/migrations/users/#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://developer.github.com/v3/repos/#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked.
    */
  @JSName("unlockRepoForAuthenticatedUser")
  var unlockRepoForAuthenticatedUser_Original: `226` = js.native
  /**
    * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://developer.github.com/v3/repos/#delete-a-repository) when the migration is complete and you no longer need the source data.
    */
  @JSName("unlockRepoForOrg")
  var unlockRepoForOrg_Original: `227` = js.native
  /**
    * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API
    * request. If no parameters are provided, the import will be restarted.
    */
  @JSName("updateImport")
  var updateImport_Original: `228` = js.native
  /**
    * Stop an import for a repository.
    */
  def cancelImport(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
  def cancelImport(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/import']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
  /**
    * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://developer.github.com/v3/migrations/users/#list-user-migrations) and [Get a user migration status](https://developer.github.com/v3/migrations/users/#get-a-user-migration-status) endpoints, will continue to be available even after an archive is deleted.
    */
  def deleteArchiveForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  def deleteArchiveForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/migrations/:migration_id/archive']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  /**
    * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  def deleteArchiveForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  def deleteArchiveForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/migrations/:migration_id/archive']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  /**
    * Fetches the URL to a migration archive.
    */
  def downloadArchiveForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  def downloadArchiveForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id/archive']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  /**
    * Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:
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
  def getArchiveForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  def getArchiveForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id/archive']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id/archive']['response'] */ js.Any
  ] = js.native
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This endpoint and the [Map a commit author](https://developer.github.com/v3/migrations/source_imports/#map-a-commit-author) endpoint allow you to provide correct Git author information.
    */
  def getCommitAuthors(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import/authors']['response'] */ js.Any
  ] = js.native
  def getCommitAuthors(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import/authors']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import/authors']['response'] */ js.Any
  ] = js.native
  /**
    * View the progress of an import.
    *
    * **Import status**
    *
    * This section includes details about the possible values of the `status` field of the Import Progress response.
    *
    * An import that does not have errors will progress through these steps:
    *
    * *   `detecting` - the "detection" step of the import is in progress because the request did not include a `vcs` parameter. The import is identifying the type of source control present at the URL.
    * *   `importing` - the "raw" step of the import is in progress. This is where commit data is fetched from the original repository. The import progress response will include `commit_count` (the total number of raw commits that will be imported) and `percent` (0 - 100, the current progress through the import).
    * *   `mapping` - the "rewrite" step of the import is in progress. This is where SVN branches are converted to Git branches, and where author updates are applied. The import progress response does not include progress information.
    * *   `pushing` - the "push" step of the import is in progress. This is where the importer updates the repository on GitHub. The import progress response will include `push_percent`, which is the percent value reported by `git push` when it is "Writing objects".
    * *   `complete` - the import is complete, and the repository is ready on GitHub.
    *
    * If there are problems, you will see one of these in the `status` field:
    *
    * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update an import](https://developer.github.com/v3/migrations/source_imports/#update-an-import) section.
    * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an error message. Contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com) for more information.
    * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update an import](https://developer.github.com/v3/migrations/source_imports/#update-an-import) section.
    * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel the import](https://developer.github.com/v3/migrations/source_imports/#cancel-an-import) and [retry](https://developer.github.com/v3/migrations/source_imports/#start-an-import) with the correct URL.
    * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a `project_choices` field with the possible project choices as values. To update project choice, please see the [Update an import](https://developer.github.com/v3/migrations/source_imports/#update-an-import) section.
    *
    * **The project_choices field**
    *
    * When multiple projects are found at the provided URL, the response hash will include a `project_choices` field, the value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project hashes will differ depending on the version control type.
    *
    * **Git LFS related fields**
    *
    * This section includes details about Git LFS related fields that may be present in the Import Progress response.
    *
    * *   `use_lfs` - describes whether the import has been opted in or out of using Git LFS. The value can be `opt_in`, `opt_out`, or `undecided` if no action has been taken.
    * *   `has_large_files` - the boolean value describing whether files larger than 100MB were found during the `importing` step.
    * *   `large_files_size` - the total size in gigabytes of files larger than 100MB found in the originating repository.
    * *   `large_files_count` - the total number of files larger than 100MB found in the originating repository. To see a list of these files, make a "Get Large Files" request.
    */
  def getImportStatus(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
  def getImportStatus(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
  /**
    * List files larger than 100MB found during the import
    */
  def getLargeFiles(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import/large_files']['response'] */ js.Any
  ] = js.native
  def getLargeFiles(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import/large_files']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/import/large_files']['response'] */ js.Any
  ] = js.native
  /**
    * Fetches a single user migration. The response includes the `state` of the migration, which can be one of the following values:
    *
    * *   `pending` - the migration hasn't started yet.
    * *   `exporting` - the migration is in progress.
    * *   `exported` - the migration finished successfully.
    * *   `failed` - the migration failed.
    *
    * Once the migration has been `exported` you can [download the migration archive](https://developer.github.com/v3/migrations/users/#download-a-user-migration-archive).
    */
  def getStatusForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id']['response'] */ js.Any
  ] = js.native
  def getStatusForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id']['response'] */ js.Any
  ] = js.native
  /**
    * Fetches the status of a migration.
    *
    * The `state` of a migration can be one of the following values:
    *
    * *   `pending`, which means the migration hasn't started yet.
    * *   `exporting`, which means the migration is in progress.
    * *   `exported`, which means the migration finished successfully.
    * *   `failed`, which means the migration failed.
    */
  def getStatusForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id']['response'] */ js.Any
  ] = js.native
  def getStatusForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all migrations a user has started.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations']['response'] */ js.Any
  ] = js.native
  def listForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations']['response'] */ js.Any
  ] = js.native
  /**
    * Lists the most recent migrations.
    */
  def listForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations']['response'] */ js.Any
  ] = js.native
  def listForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations']['response'] */ js.Any
  ] = js.native
  /**
    * List all the repositories for this organization migration.
    */
  def listReposForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id/repositories']['response'] */ js.Any
  ] = js.native
  def listReposForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/migrations/:migration_id/repositories']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all the repositories for this user migration.
    */
  def listReposForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id/repositories']['response'] */ js.Any
  ] = js.native
  def listReposForUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/migrations/:migration_id/repositories']['response'] */ js.Any
  ] = js.native
  /**
    * Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository.
    */
  def mapCommitAuthor(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import/authors/:author_id']['response'] */ js.Any
  ] = js.native
  def mapCommitAuthor(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import/authors/:author_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import/authors/:author_id']['response'] */ js.Any
  ] = js.native
  /**
    * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://docs.github.com/articles/versioning-large-files/).
    */
  def setLfsPreference(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import/lfs']['response'] */ js.Any
  ] = js.native
  def setLfsPreference(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import/lfs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import/lfs']['response'] */ js.Any
  ] = js.native
  /**
    * Initiates the generation of a user migration archive.
    */
  def startForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/migrations']['response'] */ js.Any
  ] = js.native
  def startForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/migrations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/migrations']['response'] */ js.Any
  ] = js.native
  /**
    * Initiates the generation of a migration archive.
    */
  def startForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/migrations']['response'] */ js.Any
  ] = js.native
  def startForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/migrations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/migrations']['response'] */ js.Any
  ] = js.native
  /**
    * Start a source import to a GitHub repository using GitHub Importer.
    */
  def startImport(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
  def startImport(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/import']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
  /**
    * Unlocks a repository. You can lock repositories when you [start a user migration](https://developer.github.com/v3/migrations/users/#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://developer.github.com/v3/repos/#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked.
    */
  def unlockRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/migrations/:migration_id/repos/:repo_name/lock']['response'] */ js.Any
  ] = js.native
  def unlockRepoForAuthenticatedUser(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/migrations/:migration_id/repos/:repo_name/lock']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/migrations/:migration_id/repos/:repo_name/lock']['response'] */ js.Any
  ] = js.native
  /**
    * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://developer.github.com/v3/repos/#delete-a-repository) when the migration is complete and you no longer need the source data.
    */
  def unlockRepoForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock']['response'] */ js.Any
  ] = js.native
  def unlockRepoForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock']['response'] */ js.Any
  ] = js.native
  /**
    * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API
    * request. If no parameters are provided, the import will be restarted.
    */
  def updateImport(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
  def updateImport(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/import']['response'] */ js.Any
  ] = js.native
}

