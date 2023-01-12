package typings.newGithubReleaseUrl

import typings.typeFest.sourceMergeExclusiveMod.MergeExclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("new-github-release-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait BaseOptions extends StObject {
    
    /**
    	The description text of the release.
    	*/
    val body: js.UndefOr[String] = js.undefined
    
    /**
    	Whether the release should be marked as a pre-release.
    	@default false
    	*/
    val isPrerelease: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The tag name of the release.
    	*/
    val tag: js.UndefOr[String] = js.undefined
    
    /**
    	The branch name or commit SHA to point the release's tag at, if the tag doesn't already exist.
    	Default: The default branch.
    	*/
    val target: js.UndefOr[String] = js.undefined
    
    /**
    	The title of the release.
    	GitHub shows the `tag` name when not specified.
    	*/
    val title: js.UndefOr[String] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setIsPrerelease(value: Boolean): Self = StObject.set(x, "isPrerelease", value.asInstanceOf[js.Any])
      
      inline def setIsPrereleaseUndefined: Self = StObject.set(x, "isPrerelease", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type Options = MergeExclusive[RepoUrlOptions, UserRepoOptions]
  
  trait RepoUrlOptions
    extends StObject
       with BaseOptions {
    
    /**
    	The full URL to the repo.
    	*/
    val repoUrl: String
  }
  object RepoUrlOptions {
    
    inline def apply(repoUrl: String): RepoUrlOptions = {
      val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepoUrlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepoUrlOptions] (val x: Self) extends AnyVal {
      
      inline def setRepoUrl(value: String): Self = StObject.set(x, "repoUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserRepoOptions
    extends StObject
       with BaseOptions {
    
    /**
    	GitHub repo.
    	*/
    val repo: String
    
    /**
    	GitHub username or organization.
    	*/
    val user: String
  }
  object UserRepoOptions {
    
    inline def apply(repo: String, user: String): UserRepoOptions = {
      val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserRepoOptions] (val x: Self) extends AnyVal {
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
