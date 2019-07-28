package typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod

import typings.newDashGithubDashIssueDashUrl.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("new-github-issue-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function newGithubIssueUrl(options: newGithubIssueUrl.Options): string;
  // export = newGithubIssueUrl;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(options: Options): String = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function newGithubIssueUrl(options: newGithubIssueUrl.Options): string;
  // export = newGithubIssueUrl;
  def default(options: Options): String = js.native
}

