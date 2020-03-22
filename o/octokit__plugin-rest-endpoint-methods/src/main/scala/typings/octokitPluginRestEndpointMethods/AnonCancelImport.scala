package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsCancelImportParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsDeleteArchiveForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsDeleteArchiveForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsDownloadArchiveForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsGetArchiveForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsGetCommitAuthorsParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsGetImportProgressParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsGetLargeFilesParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsGetStatusForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsGetStatusForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsListForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsListForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsListReposForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsListReposForUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsMapCommitAuthorParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsSetLfsPreferenceParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsStartForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsStartForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsStartImportParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsUnlockRepoForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsUnlockRepoForOrgParams
import typings.octokitPluginRestEndpointMethods.typesMod.MigrationsUpdateImportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelImport extends js.Object {
  /**
    * Stop an import for a repository.
    */
  @JSName("cancelImport")
  var cancelImport_Original: Anon179 = js.native
  /**
    * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://developer.github.com/v3/migrations/users/#list-user-migrations) and [Get the status of a user migration](https://developer.github.com/v3/migrations/users/#get-the-status-of-a-user-migration) endpoints, will continue to be available even after an archive is deleted.
    */
  @JSName("deleteArchiveForAuthenticatedUser")
  var deleteArchiveForAuthenticatedUser_Original: Anon180 = js.native
  /**
    * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  @JSName("deleteArchiveForOrg")
  var deleteArchiveForOrg_Original: Anon181 = js.native
  /**
    * Fetches the URL to a migration archive.
    */
  @JSName("downloadArchiveForOrg")
  var downloadArchiveForOrg_Original: Anon182 = js.native
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
  var getArchiveForAuthenticatedUser_Original: Anon183 = js.native
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This API method and the "Map a commit author" method allow you to provide correct Git author information.
    */
  @JSName("getCommitAuthors")
  var getCommitAuthors_Original: Anon184 = js.native
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
    * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an error message. Contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com) for more information.
    * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel the import](https://developer.github.com/v3/migrations/source_imports/#cancel-an-import) and [retry](https://developer.github.com/v3/migrations/source_imports/#start-an-import) with the correct URL.
    * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a `project_choices` field with the possible project choices as values. To update project choice, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
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
  @JSName("getImportProgress")
  var getImportProgress_Original: Anon185 = js.native
  /**
    * List files larger than 100MB found during the import
    */
  @JSName("getLargeFiles")
  var getLargeFiles_Original: Anon186 = js.native
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
  var getStatusForAuthenticatedUser_Original: Anon187 = js.native
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
  var getStatusForOrg_Original: Anon188 = js.native
  /**
    * Lists all migrations a user has started.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: Anon189 = js.native
  /**
    * Lists the most recent migrations.
    */
  @JSName("listForOrg")
  var listForOrg_Original: Anon190 = js.native
  /**
    * List all the repositories for this organization migration.
    */
  @JSName("listReposForOrg")
  var listReposForOrg_Original: Anon191 = js.native
  /**
    * Lists all the repositories for this user migration.
    */
  @JSName("listReposForUser")
  var listReposForUser_Original: Anon192 = js.native
  /**
    * Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository.
    */
  @JSName("mapCommitAuthor")
  var mapCommitAuthor_Original: Anon193 = js.native
  /**
    * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://help.github.com/articles/versioning-large-files/).
    */
  @JSName("setLfsPreference")
  var setLfsPreference_Original: Anon194 = js.native
  /**
    * Initiates the generation of a user migration archive.
    */
  @JSName("startForAuthenticatedUser")
  var startForAuthenticatedUser_Original: Anon195 = js.native
  /**
    * Initiates the generation of a migration archive.
    */
  @JSName("startForOrg")
  var startForOrg_Original: Anon196 = js.native
  /**
    * Start a source import to a GitHub repository using GitHub Importer.
    */
  @JSName("startImport")
  var startImport_Original: Anon197 = js.native
  /**
    * Unlocks a repository. You can lock repositories when you [start a user migration](https://developer.github.com/v3/migrations/users/#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://developer.github.com/v3/repos/#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked.
    */
  @JSName("unlockRepoForAuthenticatedUser")
  var unlockRepoForAuthenticatedUser_Original: Anon198 = js.native
  /**
    * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://developer.github.com/v3/repos/#delete-a-repository) when the migration is complete and you no longer need the source data.
    */
  @JSName("unlockRepoForOrg")
  var unlockRepoForOrg_Original: Anon199 = js.native
  /**
    * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API request. If no parameters are provided, the import will be restarted.
    *
    * Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will have the status `detection_found_multiple` and the Import Progress response will include a `project_choices` array. You can select the project to import by providing one of the objects in the `project_choices` array in the update request.
    *
    * The following example demonstrates the workflow for updating an import with "project1" as the project choice. Given a `project_choices` array like such:
    *
    * To restart an import, no parameters are provided in the update request.
    */
  @JSName("updateImport")
  var updateImport_Original: Anon200 = js.native
  /**
    * Stop an import for a repository.
    */
  def cancelImport(): js.Promise[AnyResponse] = js.native
  def cancelImport(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsCancelImportParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://developer.github.com/v3/migrations/users/#list-user-migrations) and [Get the status of a user migration](https://developer.github.com/v3/migrations/users/#get-the-status-of-a-user-migration) endpoints, will continue to be available even after an archive is deleted.
    */
  def deleteArchiveForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def deleteArchiveForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsDeleteArchiveForAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
    */
  def deleteArchiveForOrg(): js.Promise[AnyResponse] = js.native
  def deleteArchiveForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsDeleteArchiveForOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Fetches the URL to a migration archive.
    */
  def downloadArchiveForOrg(): js.Promise[AnyResponse] = js.native
  def downloadArchiveForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsDownloadArchiveForOrgParams
  ): js.Promise[AnyResponse] = js.native
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
  def getArchiveForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def getArchiveForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsGetArchiveForAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This API method and the "Map a commit author" method allow you to provide correct Git author information.
    */
  def getCommitAuthors(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetCommitAuthorsResponse> */ _
  ] = js.native
  def getCommitAuthors(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsGetCommitAuthorsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetCommitAuthorsResponse> */ _
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
    * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an error message. Contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com) for more information.
    * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
    * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel the import](https://developer.github.com/v3/migrations/source_imports/#cancel-an-import) and [retry](https://developer.github.com/v3/migrations/source_imports/#start-an-import) with the correct URL.
    * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a `project_choices` field with the possible project choices as values. To update project choice, please see the [Update Existing Import](https://developer.github.com/v3/migrations/source_imports/#update-existing-import) section.
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
  def getImportProgress(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetImportProgressResponse> */ _
  ] = js.native
  def getImportProgress(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsGetImportProgressParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetImportProgressResponse> */ _
  ] = js.native
  /**
    * List files larger than 100MB found during the import
    */
  def getLargeFiles(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetLargeFilesResponse> */ _
  ] = js.native
  def getLargeFiles(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsGetLargeFilesParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetLargeFilesResponse> */ _
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetStatusForAuthenticatedUserResponse> */ _
  ] = js.native
  def getStatusForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsGetStatusForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetStatusForAuthenticatedUserResponse> */ _
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetStatusForOrgResponse> */ _
  ] = js.native
  def getStatusForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsGetStatusForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsGetStatusForOrgResponse> */ _
  ] = js.native
  /**
    * Lists all migrations a user has started.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListForAuthenticatedUserResponse> */ _
  ] = js.native
  def listForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsListForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Lists the most recent migrations.
    */
  def listForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListForOrgResponse> */ _
  ] = js.native
  def listForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsListForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListForOrgResponse> */ _
  ] = js.native
  /**
    * List all the repositories for this organization migration.
    */
  def listReposForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListReposForOrgResponse> */ _
  ] = js.native
  def listReposForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsListReposForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListReposForOrgResponse> */ _
  ] = js.native
  /**
    * Lists all the repositories for this user migration.
    */
  def listReposForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListReposForUserResponse> */ _
  ] = js.native
  def listReposForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsListReposForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsListReposForUserResponse> */ _
  ] = js.native
  /**
    * Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository.
    */
  def mapCommitAuthor(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsMapCommitAuthorResponse> */ _
  ] = js.native
  def mapCommitAuthor(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsMapCommitAuthorParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsMapCommitAuthorResponse> */ _
  ] = js.native
  /**
    * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://help.github.com/articles/versioning-large-files/).
    */
  def setLfsPreference(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsSetLfsPreferenceResponse> */ _
  ] = js.native
  def setLfsPreference(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsSetLfsPreferenceParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsSetLfsPreferenceResponse> */ _
  ] = js.native
  /**
    * Initiates the generation of a user migration archive.
    */
  def startForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsStartForAuthenticatedUserResponse> */ _
  ] = js.native
  def startForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsStartForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsStartForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Initiates the generation of a migration archive.
    */
  def startForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsStartForOrgResponse> */ _
  ] = js.native
  def startForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsStartForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsStartForOrgResponse> */ _
  ] = js.native
  /**
    * Start a source import to a GitHub repository using GitHub Importer.
    */
  def startImport(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsStartImportResponse> */ _
  ] = js.native
  def startImport(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsStartImportParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsStartImportResponse> */ _
  ] = js.native
  /**
    * Unlocks a repository. You can lock repositories when you [start a user migration](https://developer.github.com/v3/migrations/users/#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://developer.github.com/v3/repos/#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked.
    */
  def unlockRepoForAuthenticatedUser(): js.Promise[AnyResponse] = js.native
  def unlockRepoForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsUnlockRepoForAuthenticatedUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://developer.github.com/v3/repos/#delete-a-repository) when the migration is complete and you no longer need the source data.
    */
  def unlockRepoForOrg(): js.Promise[AnyResponse] = js.native
  def unlockRepoForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsUnlockRepoForOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API request. If no parameters are provided, the import will be restarted.
    *
    * Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will have the status `detection_found_multiple` and the Import Progress response will include a `project_choices` array. You can select the project to import by providing one of the objects in the `project_choices` array in the update request.
    *
    * The following example demonstrates the workflow for updating an import with "project1" as the project choice. Given a `project_choices` array like such:
    *
    * To restart an import, no parameters are provided in the update request.
    */
  def updateImport(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsUpdateImportResponse> */ _
  ] = js.native
  def updateImport(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MigrationsUpdateImportParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<MigrationsUpdateImportResponse> */ _
  ] = js.native
}

