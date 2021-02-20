package typings.newGithubIssueUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Generate a URL for opening a new GitHub issue with prefilled title, body, and other fields.
  	@example
  	```
  	import newGithubIssueUrl = require('new-github-issue-url');
  	import opn = require('opn');
  	const url = newGithubIssueUrl({
  		user: 'sindresorhus',
  		repo: 'new-github-issue-url',
  		body: '\n\n\n---\nI\'m a human. Please be nice.'
  	});
  	//=> 'https://github.com/sindresorhus/new-github-issue-url/issues/new?body=%0A%0A%0A---%0AI%27m+a+human.+Please+be+nice.'
  	// Then open it
  	opn(url);
  	```
  	*/
  @JSImport("new-github-issue-url", JSImport.Namespace)
  @js.native
  def apply(options: Options): String = js.native
  
  @JSImport("new-github-issue-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function newGithubIssueUrl(options: newGithubIssueUrl.Options): string;
  // export = newGithubIssueUrl;
  @JSImport("new-github-issue-url", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof newGithubIssueUrl */ js.Any = js.native
  @scala.inline
  def default_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof newGithubIssueUrl */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CommonOptions extends StObject {
    
    /**
    		The user to assign to the issue.
    		_Requires the user to have the permission to add assignee._
    		*/
    val assignee: js.UndefOr[String] = js.native
    
    /**
    		The issue body.
    		*/
    val body: js.UndefOr[String] = js.native
    
    /**
    		The labels for the issue.
    		_Requires the user to have the permission to add labels._
    		*/
    val labels: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		The milestone for the issue.
    		_Requires the user to have the permission to add milestone._
    		*/
    val milestone: js.UndefOr[String] = js.native
    
    /**
    		The projects to add the issue to.
    		The project reference format is `user/<project-number>`, for example, if the URL to the project is `https://github.com/sindresorhus/some-repo/projects/3`, the project reference would be `some-repo/3`.
    		_Requires the user to have the permission to add projects._
    		*/
    val projects: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		Use an [issue template](https://help.github.com/articles/manually-creating-a-single-issue-template-for-your-repository/).
    		@example
    		```
    		'unicorn.md' // If you want to use a template at `ISSUE_TEMPLATE/unicorn.md`.
    		```
    		*/
    val template: js.UndefOr[String] = js.native
    
    /**
    		The issue title.
    		*/
    val title: js.UndefOr[String] = js.native
  }
  object CommonOptions {
    
    @scala.inline
    def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setMilestone(value: String): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
      
      @scala.inline
      def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      @scala.inline
      def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
  	You are required to either specify the `repoUrl` option or both the `user` and `repo` options.
  	*/
  /* Rewritten from type alias, can be one of: 
    - typings.newGithubIssueUrl.mod.RepoUrlOptions
    - typings.newGithubIssueUrl.mod.UserAndRepoOptions
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def RepoUrlOptions(repoUrl: String): typings.newGithubIssueUrl.mod.RepoUrlOptions = {
      val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.newGithubIssueUrl.mod.RepoUrlOptions]
    }
    
    @scala.inline
    def UserAndRepoOptions(repo: String, user: String): typings.newGithubIssueUrl.mod.UserAndRepoOptions = {
      val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.newGithubIssueUrl.mod.UserAndRepoOptions]
    }
  }
  
  @js.native
  trait RepoUrlOptions
    extends CommonOptions
       with Options {
    
    /**
    		The full URL to the repo.
    		*/
    val repoUrl: String = js.native
  }
  object RepoUrlOptions {
    
    @scala.inline
    def apply(repoUrl: String): RepoUrlOptions = {
      val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepoUrlOptions]
    }
    
    @scala.inline
    implicit class RepoUrlOptionsMutableBuilder[Self <: RepoUrlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepoUrl(value: String): Self = StObject.set(x, "repoUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserAndRepoOptions
    extends CommonOptions
       with Options {
    
    /**
    		GitHub repo.
    		*/
    val repo: String = js.native
    
    /**
    		GitHub username or organization.
    		*/
    val user: String = js.native
  }
  object UserAndRepoOptions {
    
    @scala.inline
    def apply(repo: String, user: String): UserAndRepoOptions = {
      val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAndRepoOptions]
    }
    
    @scala.inline
    implicit class UserAndRepoOptionsMutableBuilder[Self <: UserAndRepoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
