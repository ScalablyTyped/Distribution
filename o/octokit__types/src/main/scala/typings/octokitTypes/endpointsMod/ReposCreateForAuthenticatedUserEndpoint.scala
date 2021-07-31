package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.internal
import typings.octokitTypes.octokitTypesStrings.public
import typings.octokitTypes.octokitTypesStrings.visibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateForAuthenticatedUserEndpoint extends StObject {
  
  /**
    * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.
    */
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
    */
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
    */
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pass `true` to create an initial commit with empty README.
    */
  var auto_init: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A short description of the repository.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, "Haskell".
    */
  var gitignore_template: js.UndefOr[String] = js.undefined
  
  /**
    * Either `true` to enable issues for this repository or `false` to disable them.
    */
  var has_issues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.
    */
  var has_projects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either `true` to enable the wiki for this repository or `false` to disable it.
    */
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A URL with more information about the repository.
    */
  var homepage: js.UndefOr[String] = js.undefined
  
  /**
    * Either `true` to make this repo available as a template repository or `false` to prevent it.
    */
  var is_template: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, "mit" or "mpl-2.0".
    */
  var license_template: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the repository.
    */
  var name: String
  
  /**
    * Either `true` to create a private repository or `false` to create a public one.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization.
    */
  var team_id: js.UndefOr[Double] = js.undefined
  
  /**
    * Can be `public` or `private`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+, `visibility` can also be `internal`. For more information, see "[Creating an internal repository](https://docs.github.com/github/creating-cloning-and-archiving-repositories/creating-an-internal-repository)".
    * The `visibility` parameter overrides the `private` parameter when you use both parameters with the `nebula-preview` preview header.
    */
  var visibility: js.UndefOr[
    public | `private` | typings.octokitTypes.octokitTypesStrings.visibility | internal
  ] = js.undefined
}
object ReposCreateForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(name: String): ReposCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateForAuthenticatedUserEndpointMutableBuilder[Self <: ReposCreateForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_merge_commit(value: Boolean): Self = StObject.set(x, "allow_merge_commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_merge_commitUndefined: Self = StObject.set(x, "allow_merge_commit", js.undefined)
    
    @scala.inline
    def setAllow_rebase_merge(value: Boolean): Self = StObject.set(x, "allow_rebase_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_rebase_mergeUndefined: Self = StObject.set(x, "allow_rebase_merge", js.undefined)
    
    @scala.inline
    def setAllow_squash_merge(value: Boolean): Self = StObject.set(x, "allow_squash_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_squash_mergeUndefined: Self = StObject.set(x, "allow_squash_merge", js.undefined)
    
    @scala.inline
    def setAuto_init(value: Boolean): Self = StObject.set(x, "auto_init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_initUndefined: Self = StObject.set(x, "auto_init", js.undefined)
    
    @scala.inline
    def setDelete_branch_on_merge(value: Boolean): Self = StObject.set(x, "delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_branch_on_mergeUndefined: Self = StObject.set(x, "delete_branch_on_merge", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGitignore_template(value: String): Self = StObject.set(x, "gitignore_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitignore_templateUndefined: Self = StObject.set(x, "gitignore_template", js.undefined)
    
    @scala.inline
    def setHas_issues(value: Boolean): Self = StObject.set(x, "has_issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_issuesUndefined: Self = StObject.set(x, "has_issues", js.undefined)
    
    @scala.inline
    def setHas_projects(value: Boolean): Self = StObject.set(x, "has_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_projectsUndefined: Self = StObject.set(x, "has_projects", js.undefined)
    
    @scala.inline
    def setHas_wiki(value: Boolean): Self = StObject.set(x, "has_wiki", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_wikiUndefined: Self = StObject.set(x, "has_wiki", js.undefined)
    
    @scala.inline
    def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    @scala.inline
    def setIs_template(value: Boolean): Self = StObject.set(x, "is_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_templateUndefined: Self = StObject.set(x, "is_template", js.undefined)
    
    @scala.inline
    def setLicense_template(value: String): Self = StObject.set(x, "license_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense_templateUndefined: Self = StObject.set(x, "license_template", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_idUndefined: Self = StObject.set(x, "team_id", js.undefined)
    
    @scala.inline
    def setVisibility(value: public | `private` | visibility | internal): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
