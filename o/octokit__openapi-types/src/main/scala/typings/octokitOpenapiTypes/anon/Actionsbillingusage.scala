package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.mod.OneOf
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.DraftIssue
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PullRequest
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`false positive`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`used in tests`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.actions
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.analyst
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.collaborators_only
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.composer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.contributors_only
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.coordinator
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.erlang
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.evaluate
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.existing_users
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.false_positive
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.finder
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.generated
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.go
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.library
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.local_only
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maven
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.note
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.npm
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.nuget
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.one_day
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.one_month
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.one_week
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.other
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pip
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pub
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_developer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_reviewer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_verifier
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reporter
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.revoked
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rubygems
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rust
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.six_months
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.source
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.sponsor
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.test
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.three_days
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tool
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.used_in_tests
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.warning
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.wont_fix
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actionsbillingusage extends StObject {
  
  /**
    * Package
    * @description A software package
    */
  @JSName("package")
  var _package: Versioncount
  
  var `actions-billing-usage`: Includedminutes
  
  /**
    * Repository actions caches
    * @description Repository actions caches
    */
  var `actions-cache-list`: Actionscaches
  
  /**
    * Actions Cache Usage by repository
    * @description GitHub Actions Cache Usage by repository.
    */
  var `actions-cache-usage-by-repository`: Activecachescount
  
  var `actions-cache-usage-org-enterprise`: Totalactivecachescount
  
  /** @description Whether GitHub Actions can approve pull requests. Enabling this can be a security risk. */
  var `actions-can-approve-pull-request-reviews`: Boolean
  
  /**
    * @description The default workflow permissions granted to the GITHUB_TOKEN when running workflows.
    * @enum {string}
    */
  var `actions-default-workflow-permissions`: read | write
  
  /** @description Whether GitHub Actions is enabled on the repository. */
  var `actions-enabled`: Boolean
  
  var `actions-get-default-workflow-permissions`: Canapprovepullrequestreviews
  
  var `actions-organization-permissions`: Enabledrepositories
  
  /**
    * ActionsPublicKey
    * @description The public key used for setting Actions Secrets.
    */
  var `actions-public-key`: CreatedatId
  
  var `actions-repository-permissions`: Selectedactionsurl
  
  /**
    * Actions Secret
    * @description Set secrets for GitHub Actions.
    */
  var `actions-secret`: NameUpdatedat
  
  var `actions-set-default-workflow-permissions`: Defaultworkflowpermissions
  
  /** Actions Variable */
  var `actions-variable`: UpdatedatValue
  
  var `actions-workflow-access-to-repository`: Accesslevel
  
  /**
    * Actor
    * @description Actor
    */
  var actor: Displaylogin
  
  /**
    * Added to Project Issue Event
    * @description Added to Project Issue Event
    */
  var `added-to-project-issue-event`: Projectcard
  
  /**
    * Format: date-time
    * @description The time that the alert was auto-dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val `alert-auto-dismissed-at`: String | Null
  
  /**
    * Format: date-time
    * @description The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val `alert-created-at`: String
  
  /**
    * Format: date-time
    * @description The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val `alert-dismissed-at`: String | Null
  
  /**
    * Format: date-time
    * @description The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val `alert-fixed-at`: String | Null
  
  /**
    * Format: uri
    * @description The GitHub URL of the alert resource.
    */
  val `alert-html-url`: String
  
  /**
    * Format: uri
    * @description The REST API URL for fetching the list of instances for an alert.
    */
  val `alert-instances-url`: String
  
  /** @description The security alert number. */
  val `alert-number`: Double
  
  /**
    * Format: date-time
    * @description The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val `alert-updated-at`: String
  
  /**
    * Format: uri
    * @description The REST API URL of the alert resource.
    */
  val `alert-url`: String
  
  /**
    * @description The permissions policy that controls the actions and reusable workflows that are allowed to run.
    * @enum {string}
    */
  var `allowed-actions`: all | local_only | selected
  
  /**
    * Api Overview
    * @description Api Overview
    */
  var `api-overview`: Api
  
  /**
    * App Permissions
    * @description The permissions granted to the user-to-server access token.
    * @example {
    *   "contents": "read",
    *   "issues": "read",
    *   "deployments": "write",
    *   "single_file": "read"
    * }
    */
  var `app-permissions`: Administration
  
  /**
    * Artifact
    * @description An artifact
    */
  var artifact: Archivedownloadurl
  
  /**
    * Assigned Issue Event
    * @description Assigned Issue Event
    */
  var `assigned-issue-event`: ActorAssignee
  
  /**
    * Authentication Token
    * @description Authentication Token
    */
  var `authentication-token`: Singlefile
  
  /**
    * author_association
    * @description How the author is associated with the repository.
    * @example OWNER
    * @enum {string}
    */
  var `author-association`: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /**
    * Authorization
    * @description The authorization for an OAuth app, GitHub App, or a Personal Access Token.
    */
  var authorization: App
  
  /**
    * Auto merge
    * @description The status of auto merging a pull request.
    */
  var `auto-merge`: Committitle | Null
  
  /**
    * Autolink reference
    * @description An autolink reference.
    */
  var autolink: Keyprefix
  
  /**
    * Base Gist
    * @description Base Gist
    */
  var `base-gist`: Commentsurl
  
  /**
    * Basic Error
    * @description Basic Error
    */
  var `basic-error`: DocumentationurlMessage
  
  /**
    * Blob
    * @description Blob
    */
  var blob: Highlightedcontent
  
  /**
    * Branch Protection
    * @description Branch Protection
    */
  var `branch-protection`: Allowforcepushes
  
  /**
    * Branch Restriction Policy
    * @description Branch Restriction Policy
    */
  var `branch-restriction-policy`: Appsurl
  
  /**
    * Branch Short
    * @description Branch Short
    */
  var `branch-short`: CommitName
  
  /**
    * Branch With Protection
    * @description Branch With Protection
    */
  var `branch-with-protection`: Protection
  
  /**
    * Check Annotation
    * @description Check Annotation
    */
  var `check-annotation`: Blobhref
  
  /**
    * CheckRun
    * @description A check performed on the code of a given code change
    */
  var `check-run`: Checksuite
  
  /**
    * CheckRun
    * @description A check performed on the code of a given code change
    */
  var `check-run-with-simple-check-suite`: Deployment
  
  /**
    * CheckSuite
    * @description A suite of checks performed on the code of a given code change
    */
  var `check-suite`: Checkrunsurl
  
  /**
    * Check Suite Preference
    * @description Check suite configuration preferences for a repository.
    */
  var `check-suite-preference`: Preferences
  
  /**
    * Clone Traffic
    * @description Clone Traffic
    */
  var `clone-traffic`: Clones
  
  /**
    * Code Frequency Stat
    * @description Code Frequency Stat
    */
  var `code-frequency-stat`: js.Array[Double]
  
  /**
    * Code Of Conduct
    * @description Code Of Conduct
    */
  var `code-of-conduct`: BodyHtmlurl
  
  /**
    * Code Of Conduct Simple
    * @description Code of Conduct Simple
    */
  var `code-of-conduct-simple`: HtmlurlKey
  
  var `code-scanning-alert`: Fixedat
  
  /**
    * @description A classification of the file. For example to identify it as generated.
    * @enum {string|null}
    */
  var `code-scanning-alert-classification`: source | generated | test | library | Null
  
  /** @description The dismissal comment associated with the dismissal of the alert. */
  var `code-scanning-alert-dismissed-comment`: String | Null
  
  /**
    * @description **Required when the state is dismissed.** The reason for dismissing or closing the alert.
    * @enum {string|null}
    */
  var `code-scanning-alert-dismissed-reason`: _empty | (`false positive`) | (/* won't fix */ String) | (`used in tests`) | Null
  
  /** @description Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed. */
  var `code-scanning-alert-environment`: String
  
  var `code-scanning-alert-instance`: Analysiskey
  
  var `code-scanning-alert-items`: Dismissedby
  
  /** @description Describe a region within a file for the alert. */
  var `code-scanning-alert-location`: Endcolumn
  
  var `code-scanning-alert-rule`: Fulldescription
  
  var `code-scanning-alert-rule-summary`: DescriptionId
  
  /**
    * @description Sets the state of the code scanning alert. You must provide `dismissed_reason` when you set the state to `dismissed`.
    * @enum {string}
    */
  var `code-scanning-alert-set-state`: open | dismissed
  
  /**
    * @description Severity of a code scanning alert.
    * @enum {string}
    */
  var `code-scanning-alert-severity`: critical | high | medium | low | warning | note | error
  
  /**
    * @description State of a code scanning alert.
    * @enum {string}
    */
  var `code-scanning-alert-state`: open | closed | dismissed | fixed
  
  var `code-scanning-analysis`: Deletable
  
  /** @description Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. */
  var `code-scanning-analysis-analysis-key`: String
  
  /** @description Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code. */
  var `code-scanning-analysis-category`: String
  
  /** @description The SHA of the commit to which the analysis you are uploading relates. */
  var `code-scanning-analysis-commit-sha`: String
  
  /**
    * Format: date-time
    * @description The time that the analysis was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val `code-scanning-analysis-created-at`: String
  
  /**
    * Analysis deletion
    * @description Successful deletion of a code scanning analysis
    */
  var `code-scanning-analysis-deletion`: Confirmdeleteurl
  
  /** @description Identifies the variable values associated with the environment in which this analysis was performed. */
  var `code-scanning-analysis-environment`: String
  
  /** @description A Base64 string representing the SARIF file to upload. You must first compress your SARIF file using [`gzip`](http://www.gnu.org/software/gzip/manual/gzip.html) and then translate the contents of the file into a Base64 encoding string. For more information, see "[SARIF support for code scanning](https://docs.github.com/code-security/secure-coding/sarif-support-for-code-scanning)." */
  var `code-scanning-analysis-sarif-file`: String
  
  /**
    * @description An identifier for the upload.
    * @example 6c81cd8e-b078-4ac3-a3be-1dad7dbd0b53
    */
  var `code-scanning-analysis-sarif-id`: String
  
  var `code-scanning-analysis-tool`: Guid
  
  /** @description The GUID of the tool used to generate the code scanning analysis, if provided in the uploaded SARIF data. */
  var `code-scanning-analysis-tool-guid`: String | Null
  
  /** @description The name of the tool used to generate the code scanning analysis. */
  var `code-scanning-analysis-tool-name`: String
  
  /** @description The version of the tool used to generate the code scanning analysis. */
  var `code-scanning-analysis-tool-version`: String | Null
  
  /**
    * Format: uri
    * @description The REST API URL of the analysis resource.
    */
  val `code-scanning-analysis-url`: String
  
  /**
    * CodeQL Database
    * @description A CodeQL database.
    */
  var `code-scanning-codeql-database`: Uploader
  
  /** @description Configuration for code scanning default setup. */
  var `code-scanning-default-setup`: Languages
  
  /** @description Configuration for code scanning default setup. */
  var `code-scanning-default-setup-update`: Querysuite
  
  /**
    * @description You can use `run_url` to track the status of the run. This includes a property status and conclusion.
    * You should not rely on this always being an actions workflow run object.
    */
  var `code-scanning-default-setup-update-response`: Runurl
  
  var `code-scanning-organization-alert-items`: Dismissedat
  
  /**
    * @description The full Git reference, formatted as `refs/heads/<branch name>`,
    * `refs/pull/<number>/merge`, or `refs/pull/<number>/head`.
    */
  var `code-scanning-ref`: String
  
  var `code-scanning-sarifs-receipt`: IdUrl
  
  var `code-scanning-sarifs-status`: Analysesurl
  
  /**
    * Code Search Result Item
    * @description Code Search Result Item
    */
  var `code-search-result-item`: Filesize
  
  /**
    * CODEOWNERS errors
    * @description A list of errors found in a repo's CODEOWNERS file
    */
  var `codeowners-errors`: ErrorsArray
  
  /**
    * Codespace
    * @description A codespace.
    */
  var codespace: Environmentid
  
  /**
    * Fetches information about an export of a codespace.
    * @description An export of a codespace. Also, latest export details for a codespace can be fetched with id = latest
    */
  var `codespace-export-details`: Exporturl
  
  /**
    * Codespace machine
    * @description A description of the machine powering a codespace.
    */
  var `codespace-machine`: Cpus
  
  /**
    * Codespace
    * @description A codespace.
    */
  var `codespace-with-full-repository`: Gitstatus
  
  /**
    * Codespaces Secret
    * @description Secrets for a GitHub Codespace.
    */
  var `codespaces-org-secret`: CreatedatName
  
  /**
    * CodespacesPublicKey
    * @description The public key used for setting Codespaces secrets.
    */
  var `codespaces-public-key`: CreatedatId
  
  /**
    * Codespaces Secret
    * @description Secrets for a GitHub Codespace.
    */
  var `codespaces-secret`: SelectedrepositoriesurlUpdatedat
  
  /**
    * CodespacesUserPublicKey
    * @description The public key used for setting user Codespaces' Secrets.
    */
  var `codespaces-user-public-key`: KeyKeyid
  
  /**
    * Collaborator
    * @description Collaborator
    */
  var collaborator: Followingurl
  
  var `combined-billing-usage`: Daysleftinbillingcycle
  
  /**
    * Combined Commit Status
    * @description Combined Commit Status
    */
  var `combined-commit-status`: Commiturl
  
  /**
    * Commit
    * @description Commit
    */
  var commit: Stats
  
  /**
    * Commit Activity
    * @description Commit Activity
    */
  var `commit-activity`: Days
  
  /**
    * Commit Comment
    * @description Commit Comment
    */
  var `commit-comment`: Reactions
  
  /**
    * Commit Comparison
    * @description Commit Comparison
    */
  var `commit-comparison`: Aheadby
  
  /**
    * Commit Search Result Item
    * @description Commit Search Result Item
    */
  var `commit-search-result-item`: Textmatches
  
  /**
    * Community Profile
    * @description Community Profile
    */
  var `community-profile`: Contentreportsenabled
  
  /**
    * Content Directory
    * @description A list of directory items
    */
  var `content-directory`: js.Array[Giturl]
  
  /**
    * Content File
    * @description Content File
    */
  var `content-file`: Submodulegiturl
  
  /**
    * Submodule Content
    * @description An object describing a submodule
    */
  var `content-submodule`: DownloadurlGiturl
  
  /**
    * Symlink Content
    * @description An object describing a symlink
    */
  var `content-symlink`: Target
  
  /**
    * Content Traffic
    * @description Content Traffic
    */
  var `content-traffic`: Uniques
  
  /**
    * Content Tree
    * @description Content Tree
    */
  var `content-tree`: Entries
  
  /**
    * Contributor
    * @description Contributor
    */
  var contributor: Contributions
  
  /**
    * Contributor Activity
    * @description Contributor Activity
    */
  var `contributor-activity`: Total
  
  /**
    * Converted Note to Issue Issue Event
    * @description Converted Note to Issue Issue Event
    */
  var `converted-note-to-issue-issue-event`: CreatedatEvent
  
  /**
    * Custom deployment protection rule app
    * @description A GitHub App that is providing a custom deployment protection rule.
    */
  var `custom-deployment-rule-app`: Integrationurl
  
  /**
    * Demilestoned Issue Event
    * @description Demilestoned Issue Event
    */
  var `demilestoned-issue-event`: CommitidCommiturl
  
  /** @description A Dependabot alert. */
  var `dependabot-alert`: Dependency
  
  /** @description Details for the vulnerable package. */
  val `dependabot-alert-package`: EcosystemName
  
  /** @description Details for the GitHub Security Advisory. */
  val `dependabot-alert-security-advisory`: Cveid
  
  /** @description Details pertaining to one vulnerable version range for the advisory. */
  val `dependabot-alert-security-vulnerability`: Firstpatchedversion
  
  /** @description A Dependabot alert. */
  var `dependabot-alert-with-repository`: Autodismissedat
  
  /**
    * DependabotPublicKey
    * @description The public key used for setting Dependabot Secrets.
    */
  var `dependabot-public-key`: KeyKeyid
  
  /**
    * Dependabot Secret
    * @description Set secrets for Dependabot.
    */
  var `dependabot-secret`: NameUpdatedat
  
  var dependency: Dependencies
  
  /**
    * Dependency Graph Diff
    * @description A diff of the dependencies between two commits.
    */
  var `dependency-graph-diff`: js.Array[Changetype]
  
  /**
    * Dependency Graph SPDX SBOM
    * @description A schema for the SPDX JSON format returned by the Dependency Graph.
    */
  var `dependency-graph-spdx-sbom`: Sbom
  
  /**
    * Deploy Key
    * @description An SSH key granting access to a single repository.
    */
  var `deploy-key`: Addedby
  
  /**
    * Deployment
    * @description A request for a specific ref(branch,sha,tag) to be deployed
    */
  var deployment: Originalenvironment
  
  /**
    * Deployment branch policy
    * @description Details of a deployment branch policy.
    */
  var `deployment-branch-policy`: NameNodeid
  
  /** Deployment branch policy name pattern */
  var `deployment-branch-policy-name-pattern`: Name
  
  /** @description The type of deployment branch policy for this environment. To allow all branches to deploy, set to `null`. */
  var `deployment-branch-policy-settings`: Custombranchpolicies | Null
  
  /**
    * Deployment protection rule
    * @description Deployment protection rule
    */
  var `deployment-protection-rule`: AppEnabled
  
  /**
    * @description The type of reviewer.
    * @example User
    * @enum {string}
    */
  var `deployment-reviewer-type`: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team
  
  /**
    * Deployment
    * @description A deployment created as the result of an Actions check run from a workflow that references an environment
    */
  var `deployment-simple`: Performedviagithubapp
  
  /**
    * Deployment Status
    * @description The status of a deployment.
    */
  var `deployment-status`: Deploymenturl
  
  /**
    * Diff Entry
    * @description Diff Entry
    */
  var `diff-entry`: Bloburl
  
  /**
    * Discussion
    * @description A Discussion in a repository.
    */
  var discussion: Answerchosenat
  
  /**
    * Email
    * @description Email
    */
  var email: Primary
  
  /**
    * Empty Object
    * @description An object without any properties.
    */
  var `empty-object`: Record[String, scala.Nothing]
  
  /**
    * @description The policy that controls the repositories in the organization that are allowed to run GitHub Actions.
    * @enum {string}
    */
  var `enabled-repositories`: all | none_ | selected
  
  /**
    * Enterprise
    * @description An enterprise on GitHub.
    */
  var enterprise: Htmlurl
  
  /**
    * Environment
    * @description Details of a deployment environment
    */
  var environment: Protectionrules
  
  /**
    * Environment Approval
    * @description An entry in the reviews log for environment deployments
    */
  var `environment-approvals`: CommentEnvironments
  
  /**
    * Event
    * @description Event
    */
  var event: Public
  
  /**
    * Feed
    * @description Feed
    */
  var feed: Currentuseractorurl
  
  /**
    * File Commit
    * @description File Commit
    */
  var `file-commit`: CommitContent
  
  /**
    * Full Repository
    * @description Full Repository
    */
  var `full-repository`: Anonymousaccessenabled
  
  /**
    * Gist Comment
    * @description A comment made to a gist.
    */
  var `gist-comment`: User
  
  /**
    * Gist Commit
    * @description Gist Commit
    */
  var `gist-commit`: Version
  
  /**
    * Gist History
    * @description Gist History
    */
  var `gist-history`: Changestatus
  
  /**
    * Gist Simple
    * @description Gist Simple
    */
  var `gist-simple`: Forkof
  
  /**
    * Git Commit
    * @description Low-level Git commit operations within a repository
    */
  var `git-commit`: AuthorCommitter
  
  /**
    * Git Reference
    * @description Git references within a repository
    */
  var `git-ref`: NodeidObject
  
  /**
    * Git Tag
    * @description Metadata for a Git tag
    */
  var `git-tag`: Tagger
  
  /**
    * Git Tree
    * @description The hierarchy between files in a Git repository.
    */
  var `git-tree`: Truncated
  
  /**
    * Gitignore Template
    * @description Gitignore Template
    */
  var `gitignore-template`: NameSource
  
  /**
    * GPG Key
    * @description A unique encryption key
    */
  var `gpg-key`: Canencryptcomms
  
  /**
    * Webhook
    * @description Webhooks for repositories.
    */
  var hook: Lastresponse
  
  /**
    * Webhook delivery
    * @description Delivery made by a webhook.
    */
  var `hook-delivery`: Duration
  
  /**
    * Simple webhook delivery
    * @description Delivery made by a webhook, without request and response information.
    */
  var `hook-delivery-item`: Deliveredat
  
  /** Hook Response */
  var `hook-response`: MessageStatus
  
  /**
    * Hovercard
    * @description Hovercard
    */
  var hovercard: `523`
  
  /**
    * Import
    * @description A repository import from an external source.
    */
  var `import`: Authorscount
  
  /**
    * Installation
    * @description Installation
    */
  var installation: Accesstokensurl
  
  /**
    * Installation Token
    * @description Authentication token for a GitHub App installed on a user or org.
    */
  var `installation-token`: Expiresat
  
  /**
    * GitHub app
    * @description GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
    */
  var integration: Clientsecret
  
  /**
    * Integration Installation Request
    * @description Request to install an integration on a target
    */
  var `integration-installation-request`: Account
  
  /**
    * @description The duration of the interaction restriction. Default: `one_day`.
    * @example one_month
    * @enum {string}
    */
  var `interaction-expiry`: one_day | three_days | one_week | one_month | six_months
  
  /**
    * @description The type of GitHub user that can comment, open issues, or create pull requests while the interaction limit is in effect.
    * @example collaborators_only
    * @enum {string}
    */
  var `interaction-group`: existing_users | contributors_only | collaborators_only
  
  /**
    * Interaction Restrictions
    * @description Limit interactions to a specific type of user for a specified duration
    */
  var `interaction-limit`: Expiry
  
  /**
    * Interaction Limits
    * @description Interaction limit settings.
    */
  var `interaction-limit-response`: Limit
  
  /**
    * Issue
    * @description Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
    */
  var issue: Activelockreason
  
  /**
    * Issue Comment
    * @description Comments provide a way for people to collaborate on an issue.
    */
  var `issue-comment`: Authorassociation
  
  /**
    * Issue Event
    * @description Issue Event
    */
  var `issue-event`: Assigner
  
  /** Issue Event Dismissed Review */
  var `issue-event-dismissed-review`: Dismissalcommitid
  
  /**
    * Issue Event for Issue
    * @description Issue Event for Issue
    */
  var `issue-event-for-issue`: EventId_ | AssignerCommitid | NodeidPerformedviagithubapp | IdMilestone | PerformedviagithubappRename | Requestedteam | CreatedatDismissedreview | IdLockreason | PerformedviagithubappProjectcard | ProjectcardUrl
  
  /**
    * Issue Event Label
    * @description Issue Event Label
    */
  var `issue-event-label`: ColorName
  
  /**
    * Issue Event Milestone
    * @description Issue Event Milestone
    */
  var `issue-event-milestone`: TitleString
  
  /**
    * Issue Event Project Card
    * @description Issue Event Project Card
    */
  var `issue-event-project-card`: Previouscolumnname
  
  /**
    * Issue Event Rename
    * @description Issue Event Rename
    */
  var `issue-event-rename`: From
  
  /**
    * Issue Search Result Item
    * @description Issue Search Result Item
    */
  var `issue-search-result-item`: Labelsurl
  
  /**
    * Job
    * @description Information of a job execution in a workflow run
    */
  var job: Checkrunurl
  
  /**
    * Key
    * @description Key
    */
  var key: IdKey
  
  /**
    * Key Simple
    * @description Key Simple
    */
  var `key-simple`: KeyString
  
  /**
    * Label
    * @description Color-coded labels help you categorize and filter your issues (just like labels in Gmail).
    */
  var label: DefaultDescription
  
  /**
    * Label Search Result Item
    * @description Label Search Result Item
    */
  var `label-search-result-item`: NodeidScore
  
  /**
    * Labeled Issue Event
    * @description Labeled Issue Event
    */
  var `labeled-issue-event`: ActorCommitid
  
  /**
    * Language
    * @description Language
    */
  var language: StringDictionary[js.UndefOr[Double]]
  
  /**
    * License
    * @description License
    */
  var license: Implementation
  
  /**
    * License Content
    * @description License Content
    */
  var `license-content`: ContentDownloadurl
  
  /**
    * License Simple
    * @description License Simple
    */
  var `license-simple`: Nodeid
  
  /**
    * Link
    * @description Hypermedia Link
    */
  var link: HrefString
  
  /**
    * Link With Type
    * @description Hypermedia Link with Type
    */
  var `link-with-type`: Href
  
  /**
    * Locked Issue Event
    * @description Locked Issue Event
    */
  var `locked-issue-event`: CommiturlCreatedat
  
  var manifest: File
  
  /** Marketplace Account */
  var `marketplace-account`: Organizationbillingemail
  
  /**
    * Marketplace Listing Plan
    * @description Marketplace Listing Plan
    */
  var `marketplace-listing-plan`: Accountsurl
  
  /**
    * Marketplace Purchase
    * @description Marketplace Purchase
    */
  var `marketplace-purchase`: Login
  
  /**
    * Merge Group
    * @description A group of pull requests that the merge queue has grouped together to be merged.
    */
  var `merge-group`: Baseref
  
  /**
    * Merged upstream
    * @description Results of a successful merge upstream request
    */
  var `merged-upstream`: Basebranch
  
  /**
    * metadata
    * @description User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
    */
  var metadata: StringDictionary[js.UndefOr[String | Double | Boolean | Null]]
  
  /**
    * Migration
    * @description A migration.
    */
  var migration: Excludemetadata
  
  /**
    * Milestone
    * @description A collection of related issues and pull requests.
    */
  var milestone: Closedat
  
  /**
    * Milestoned Issue Event
    * @description Milestoned Issue Event
    */
  var `milestoned-issue-event`: CommitidCommiturl
  
  /**
    * Minimal Repository
    * @description Minimal Repository
    */
  var `minimal-repository`: Blobsurl
  
  /**
    * Moved Column in Project Issue Event
    * @description Moved Column in Project Issue Event
    */
  var `moved-column-in-project-issue-event`: Projectcard
  
  /**
    * Format: date-time
    * @description The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  val `nullable-alert-updated-at`: String | Null
  
  /**
    * Code Of Conduct Simple
    * @description Code of Conduct Simple
    */
  var `nullable-code-of-conduct-simple`: HtmlurlKey | Null
  
  /**
    * Codespace machine
    * @description A description of the machine powering a codespace.
    */
  var `nullable-codespace-machine`: Cpus | Null
  
  /**
    * Collaborator
    * @description Collaborator
    */
  var `nullable-collaborator`: Followingurl | Null
  
  /** Community Health File */
  var `nullable-community-health-file`: HtmlurlUrl | Null
  
  /**
    * Git User
    * @description Metaproperties for Git author/committer information.
    */
  var `nullable-git-user`: DateEmail | Null
  
  /**
    * GitHub app
    * @description GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
    */
  var `nullable-integration`: Clientsecret | Null
  
  /**
    * Issue
    * @description Issues are a great way to keep track of tasks, enhancements, and bugs for your projects.
    */
  var `nullable-issue`: Activelockreason | Null
  
  /**
    * License Simple
    * @description License Simple
    */
  var `nullable-license-simple`: Nodeid | Null
  
  /**
    * Milestone
    * @description A collection of related issues and pull requests.
    */
  var `nullable-milestone`: Closedat | Null
  
  /**
    * Minimal Repository
    * @description Minimal Repository
    */
  var `nullable-minimal-repository`: Blobsurl | Null
  
  /**
    * Repository
    * @description A repository on GitHub.
    */
  var `nullable-repository`: Allowsquashmerge | Null
  
  /** Scoped Installation */
  var `nullable-scoped-installation`: Hasmultiplesinglefiles | Null
  
  /**
    * Simple Commit
    * @description A commit.
    */
  var `nullable-simple-commit`: Timestamp | Null
  
  /**
    * Simple User
    * @description A GitHub user.
    */
  var `nullable-simple-user`: Avatarurl | Null
  
  /**
    * Team Simple
    * @description Groups of organization members that gives permissions on specified repositories.
    */
  var `nullable-team-simple`: Ldapdn | Null
  
  /**
    * Actions OIDC Subject customization
    * @description Actions OIDC Subject customization
    */
  var `oidc-custom-sub`: IncludeclaimkeysArray
  
  /**
    * Actions OIDC subject customization for a repository
    * @description Actions OIDC subject customization for a repository
    */
  var `oidc-custom-sub-repo`: Includeclaimkeys
  
  /**
    * Org Hook
    * @description Org Hook
    */
  var `org-hook`: Deliveriesurl
  
  /**
    * Org Membership
    * @description Org Membership
    */
  var `org-membership`: Organizationurl
  
  /**
    * Organization ruleset conditions
    * @description Conditions for a organization ruleset
    */
  var `org-ruleset-conditions`: Refname & Repositoryname
  
  /**
    * Actions Secret for an Organization
    * @description Secrets for GitHub Actions for an organization.
    */
  var `organization-actions-secret`: CreatedatName
  
  /**
    * Actions Variable for an Organization
    * @description Organization variable for GitHub Actions.
    */
  var `organization-actions-variable`: NameSelectedrepositoriesurl
  
  /**
    * Dependabot Secret for an Organization
    * @description Secrets for GitHub Dependabot for an organization.
    */
  var `organization-dependabot-secret`: CreatedatName
  
  /**
    * Organization Full
    * @description Organization Full
    */
  var `organization-full`: Billingemail
  
  /**
    * Organization Invitation
    * @description Organization Invitation
    */
  var `organization-invitation`: Failedat
  
  /**
    * Organization Programmatic Access Grant
    * @description Minimal representation of an organization programmatic access grant for enumerations
    */
  var `organization-programmatic-access-grant`: Accessgrantedat
  
  /**
    * Simple Organization Programmatic Access Grant Request
    * @description Minimal representation of an organization programmatic access grant request for enumerations
    */
  var `organization-programmatic-access-grant-request`: Tokenexpired
  
  var `organization-secret-scanning-alert`: Locationsurl
  
  /**
    * Organization Simple
    * @description A GitHub organization.
    */
  var `organization-simple`: Hooksurl
  
  /**
    * Package Version
    * @description A version of a software package
    */
  var `package-version`: Deletedat
  
  var `packages-billing-usage`: Includedgigabytesbandwidth
  
  /**
    * GitHub Pages
    * @description The configuration for GitHub Pages for a repository.
    */
  var page: Cname
  
  /**
    * Page Build
    * @description Page Build
    */
  var `page-build`: Error
  
  /**
    * Page Build Status
    * @description Page Build Status
    */
  var `page-build-status`: StatusUrl
  
  /**
    * GitHub Pages
    * @description The GitHub Pages deployment status.
    */
  var `page-deployment`: Pageurl
  
  /**
    * Pages Health Check Status
    * @description Pages Health Check Status
    */
  var `pages-health-check`: Altdomain
  
  /** Pages Https Certificate */
  var `pages-https-certificate`: Domains
  
  /** Pages Source Hash */
  var `pages-source-hash`: PathString
  
  /** Participation Stats */
  var `participation-stats`: AllOwner
  
  /**
    * Pending Deployment
    * @description Details of a deployment that is waiting for protection rules to pass
    */
  var `pending-deployment`: Currentusercanapprove
  
  /**
    * Personal Access Token Request
    * @description Details of a Personal Access Token Request.
    */
  var `personal-access-token-request`: Permissionsadded
  
  /**
    * Porter Author
    * @description Porter Author
    */
  var `porter-author`: Importurl
  
  /**
    * Porter Large File
    * @description Porter Large File
    */
  var `porter-large-file`: Oid
  
  /**
    * Private User
    * @description Private User
    */
  var `private-user`: Businessplus
  
  var `private-vulnerability-report-create`: Cweids
  
  /**
    * Project
    * @description Projects are a way to organize columns and cards of work.
    */
  var project: Columnsurl
  
  /**
    * Project Card
    * @description Project cards represent a scope of work.
    */
  var `project-card`: Columnname
  
  /**
    * Project Collaborator Permission
    * @description Project Collaborator Permission
    */
  var `project-collaborator-permission`: PermissionUser
  
  /**
    * Project Column
    * @description Project columns contain cards of work.
    */
  var `project-column`: Cardsurl
  
  /**
    * Projects v2 Project
    * @description A projects v2 project
    */
  var `projects-v2`: Deletedby
  
  /**
    * Projects v2 Item
    * @description An item belonging to a project
    */
  var `projects-v2-item`: Archivedat
  
  /**
    * Projects v2 Item Content Type
    * @description The type of content tracked in a project item
    * @enum {string}
    */
  var `projects-v2-item-content-type`: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Issue | PullRequest | DraftIssue
  
  /**
    * Protected Branch
    * @description Branch protections protect branches
    */
  var `protected-branch`: Blockcreations
  
  /**
    * Protected Branch Admin Enforced
    * @description Protected Branch Admin Enforced
    */
  var `protected-branch-admin-enforced`: EnabledUrl
  
  /**
    * Protected Branch Pull Request Review
    * @description Protected Branch Pull Request Review
    */
  var `protected-branch-pull-request-review`: Dismissalrestrictions
  
  /**
    * Protected Branch Required Status Check
    * @description Protected Branch Required Status Check
    */
  var `protected-branch-required-status-check`: Contextsurl
  
  /**
    * Public User
    * @description Public User
    */
  var `public-user`: Blog
  
  /**
    * Pull Request
    * @description Pull requests let you tell others about changes you've pushed to a repository on GitHub. Once a pull request is sent, interested parties can review the set of changes, discuss potential modifications, and even push follow-up commits if necessary.
    */
  var `pull-request`: Changedfiles
  
  /**
    * Pull Request Merge Result
    * @description Pull Request Merge Result
    */
  var `pull-request-merge-result`: Merged
  
  /** Pull Request Minimal */
  var `pull-request-minimal`: HeadId
  
  /**
    * Pull Request Review
    * @description Pull Request Reviews are reviews on pull requests.
    */
  var `pull-request-review`: BodyhtmlBodytext
  
  /**
    * Pull Request Review Comment
    * @description Pull Request Review Comments are comments on a portion of the Pull Request's diff.
    */
  var `pull-request-review-comment`: Diffhunk
  
  /**
    * Pull Request Review Request
    * @description Pull Request Review Request
    */
  var `pull-request-review-request`: UsersArray
  
  /**
    * Pull Request Simple
    * @description Pull Request Simple
    */
  var `pull-request-simple`: Issueurl
  
  /** Rate Limit */
  var `rate-limit`: Remaining
  
  /**
    * Rate Limit Overview
    * @description Rate Limit Overview
    */
  var `rate-limit-overview`: Rate
  
  /**
    * Reaction
    * @description Reactions to conversations provide a way to help people express their feelings more simply and effectively.
    */
  var reaction: ContentCreatedat
  
  /** Reaction Rollup */
  var `reaction-rollup`: Confused
  
  /**
    * Referenced workflow
    * @description A workflow referenced/reused by the initial caller workflow
    */
  var `referenced-workflow`: PathRef
  
  /**
    * Referrer Traffic
    * @description Referrer Traffic
    */
  var `referrer-traffic`: Referrer
  
  /**
    * Release
    * @description A release.
    */
  var release: Assets
  
  /**
    * Release Asset
    * @description Data related to a release.
    */
  var `release-asset`: Browserdownloadurl
  
  /**
    * Generated Release Notes Content
    * @description Generated name and body describing a release
    */
  var `release-notes-content`: BodyString
  
  /**
    * Removed from Project Issue Event
    * @description Removed from Project Issue Event
    */
  var `removed-from-project-issue-event`: Projectcard
  
  /**
    * Renamed Issue Event
    * @description Renamed Issue Event
    */
  var `renamed-issue-event`: Rename
  
  /**
    * Codespaces Secret
    * @description Set repository secrets for GitHub Codespaces.
    */
  var `repo-codespaces-secret`: NameUpdatedat
  
  /**
    * Required workflow
    * @description A GitHub Actions required workflow
    */
  var `repo-required-workflow`: Badgeurl
  
  /**
    * Repo Search Result Item
    * @description Repo Search Result Item
    */
  var `repo-search-result-item`: Contentsurl
  
  /**
    * Repository
    * @description A repository on GitHub.
    */
  var repository: Allowsquashmerge
  
  /** @description A repository security advisory. */
  var `repository-advisory`: Credits
  
  var `repository-advisory-create`: Cvssvectorstring
  
  /** @description A credit given to a user for a repository security advisory. */
  var `repository-advisory-credit`: StateType
  
  var `repository-advisory-update`: Summary
  
  /** @description A product affected by the vulnerability detailed in a repository security advisory. */
  var `repository-advisory-vulnerability`: Patchedversions
  
  /**
    * Repository Collaborator Permission
    * @description Repository Collaborator Permission
    */
  var `repository-collaborator-permission`: Rolename
  
  /**
    * Repository Invitation
    * @description Repository invitations let you manage who you collaborate with.
    */
  var `repository-invitation`: Expired
  
  /**
    * Repository Rule
    * @description A repository rule.
    */
  var `repository-rule`: `499` | ParametersType | `501` | `502` | `504` | `505` | `506` | `514` | `508` | `509` | `510` | `511` | `512` | `513`
  
  /**
    * branch_name_pattern
    * @description Parameters to be used for the branch_name_pattern rule
    */
  var `repository-rule-branch-name-pattern`: `512`
  
  /**
    * commit_author_email_pattern
    * @description Parameters to be used for the commit_author_email_pattern rule
    */
  var `repository-rule-commit-author-email-pattern`: `510`
  
  /**
    * commit_message_pattern
    * @description Parameters to be used for the commit_message_pattern rule
    */
  var `repository-rule-commit-message-pattern`: `509`
  
  /**
    * committer_email_pattern
    * @description Parameters to be used for the committer_email_pattern rule
    */
  var `repository-rule-committer-email-pattern`: `511`
  
  /**
    * creation
    * @description Only allow users with bypass permission to create matching refs.
    */
  var `repository-rule-creation`: `499`
  
  /**
    * deletion
    * @description Only allow users with bypass permissions to delete matching refs.
    */
  var `repository-rule-deletion`: `501`
  
  /**
    * @description The enforcement level of the ruleset. `evaluate` allows admins to test rules before enforcing them. Admins can view insights on the Rule Insights page (`evaluate` is only available with GitHub Enterprise).
    * @enum {string}
    */
  var `repository-rule-enforcement`: disabled | active | evaluate
  
  /**
    * non_fast_forward
    * @description Prevent users with push access from force pushing to branches.
    */
  var `repository-rule-non-fast-forward`: `508`
  
  /**
    * StatusCheckConfiguration
    * @description Required status check
    */
  var `repository-rule-params-status-check-configuration`: ContextIntegrationid
  
  /**
    * pull_request
    * @description Require all commits be made to a non-target branch and submitted via a pull request before they can be merged.
    */
  var `repository-rule-pull-request`: `506`
  
  /**
    * required_deployments
    * @description Choose which environments must be successfully deployed to before branches can be merged into a branch that matches this rule.
    */
  var `repository-rule-required-deployments`: `504`
  
  /**
    * required_linear_history
    * @description Prevent merge commits from being pushed to matching branches.
    */
  var `repository-rule-required-linear-history`: `502`
  
  /**
    * required_signatures
    * @description Commits pushed to matching branches must have verified signatures.
    */
  var `repository-rule-required-signatures`: `505`
  
  /**
    * required_status_checks
    * @description Choose which status checks must pass before branches can be merged into a branch that matches this rule. When enabled, commits must first be pushed to another branch, then merged or pushed directly to a branch that matches this rule after status checks have passed.
    */
  var `repository-rule-required-status-checks`: `507`
  
  /**
    * tag_name_pattern
    * @description Parameters to be used for the tag_name_pattern rule
    */
  var `repository-rule-tag-name-pattern`: `513`
  
  /**
    * update
    * @description Only allow users with bypass permission to update matching refs.
    */
  var `repository-rule-update`: ParametersType
  
  /**
    * Repository ruleset
    * @description A set of rules to apply when specified conditions are met.
    */
  var `repository-ruleset`: Links
  
  /**
    * Repository Ruleset Bypass Actor
    * @description An actor that can bypass rules in a ruleset
    */
  var `repository-ruleset-bypass-actor`: Actorid
  
  /**
    * Repository ruleset conditions for ref names
    * @description Parameters for a repository ruleset ref name condition
    */
  var `repository-ruleset-conditions`: Refname
  
  /**
    * Repository ruleset conditions for repository names
    * @description Parameters for a repository name condition
    */
  var `repository-ruleset-conditions-repository-name-target`: Repositoryname
  
  /**
    * Repository Invitation
    * @description Repository invitations let you manage who you collaborate with.
    */
  var `repository-subscription`: CreatedatIgnored
  
  var `required-workflow`: Selectedrepositoriesurl
  
  /**
    * Legacy Review Comment
    * @description Legacy Review Comment
    */
  var `review-comment`: Originalcommitid
  
  var `review-custom-gates-comment-required`: CommentEnvironmentname
  
  var `review-custom-gates-state-required`: EnvironmentnameState
  
  /**
    * Review Dismissed Issue Event
    * @description Review Dismissed Issue Event
    */
  var `review-dismissed-issue-event`: Dismissedreview
  
  /**
    * Review Request Removed Issue Event
    * @description Review Request Removed Issue Event
    */
  var `review-request-removed-issue-event`: Requestedreviewer
  
  /**
    * Review Requested Issue Event
    * @description Review Requested Issue Event
    */
  var `review-requested-issue-event`: Requestedreviewer
  
  var root: Authorizationsurl
  
  /**
    * Self hosted runners
    * @description A self hosted runner
    */
  var runner: Busy
  
  /**
    * Runner Application
    * @description Runner Application
    */
  var `runner-application`: Architecture
  
  /**
    * Self hosted runner label
    * @description A label for a self hosted runner
    */
  var `runner-label`: NameType
  
  /**
    * Scim Error
    * @description Scim Error
    */
  var `scim-error`: Detail
  
  /** Search Result Text Matches */
  var `search-result-text-matches`: js.Array[Fragment]
  
  var `secret-scanning-alert`: Pushprotectionbypassed
  
  /**
    * @description **Required when the `state` is `resolved`.** The reason for resolving the alert.
    * @enum {string|null}
    */
  var `secret-scanning-alert-resolution`: false_positive | wont_fix | revoked | used_in_tests | Null
  
  /** @description An optional comment when closing an alert. Cannot be updated or deleted. Must be `null` when changing `state` to `open`. */
  var `secret-scanning-alert-resolution-comment`: String | Null
  
  /**
    * @description Sets the state of the secret scanning alert. You must provide `resolution` when you set the state to `resolved`.
    * @enum {string}
    */
  var `secret-scanning-alert-state`: open | resolved
  
  var `secret-scanning-location`: Details
  
  /** @description Represents a 'commit' secret scanning location type. This location type shows that a secret was detected inside a commit to a repository. */
  var `secret-scanning-location-commit`: Blobsha
  
  /** @description Represents an 'issue_body' secret scanning location type. This location type shows that a secret was detected in the body of an issue. */
  var `secret-scanning-location-issue-body`: Issuebodyurl
  
  /** @description Represents an 'issue_comment' secret scanning location type. This location type shows that a secret was detected in a comment on an issue. */
  var `secret-scanning-location-issue-comment`: Issuecommenturl
  
  /** @description Represents an 'issue_title' secret scanning location type. This location type shows that a secret was detected in the title of an issue. */
  var `secret-scanning-location-issue-title`: Issuetitleurl
  
  /**
    * @description The type of credit the user is receiving.
    * @enum {string}
    */
  var `security-advisory-credit-types`: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
  
  /**
    * @description The package's language or package management ecosystem.
    * @enum {string}
    */
  var `security-advisory-ecosystems`: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
  
  var `security-and-analysis`: Secretscanning | Null
  
  var `selected-actions`: Githubownedallowed
  
  /** @description The API URL to use to get or set the actions and reusable workflows that are allowed to run, when `allowed_actions` is set to `selected`. */
  var `selected-actions-url`: String
  
  /**
    * Short Blob
    * @description Short Blob
    */
  var `short-blob`: ShaString
  
  /**
    * Short Branch
    * @description Short Branch
    */
  var `short-branch`: Commit
  
  /** @description A suite of checks performed on the code of a given code change */
  var `simple-check-suite`: Conclusion
  
  /**
    * Simple Commit
    * @description A commit.
    */
  var `simple-commit`: Timestamp
  
  /** Simple Commit Status */
  var `simple-commit-status`: Required
  
  /**
    * Simple Installation
    * @description The GitHub App installation. This property is included when the event is configured for and sent to a GitHub App.
    */
  var `simple-installation`: NodeidString
  
  /**
    * Simple Repository
    * @description A GitHub repository.
    */
  var `simple-repository`: Archiveurl
  
  /**
    * Simple User
    * @description A GitHub user.
    */
  var `simple-user`: Avatarurl
  
  /**
    * snapshot
    * @description Create a new snapshot of a repository's dependencies.
    */
  var snapshot: Detector
  
  /**
    * Social account
    * @description Social media account
    */
  var `social-account`: Provider
  
  /**
    * SSH Signing Key
    * @description A public SSH key used to sign Git commits
    */
  var `ssh-signing-key`: CreatedatIdKey
  
  /**
    * Stargazer
    * @description Stargazer
    */
  var stargazer: Starredat
  
  /**
    * Starred Repository
    * @description Starred Repository
    */
  var `starred-repository`: RepoStarredat
  
  /**
    * State Change Issue Event
    * @description State Change Issue Event
    */
  var `state-change-issue-event`: Statereason
  
  /**
    * Status
    * @description The status of a commit.
    */
  var status: AvatarurlContext
  
  /**
    * Status Check Policy
    * @description Status Check Policy
    */
  var `status-check-policy`: Strict
  
  /**
    * Tag
    * @description Tag
    */
  var tag: Tarballurl
  
  /**
    * Tag protection
    * @description Tag protection
    */
  var `tag-protection`: CreatedatEnabled
  
  /**
    * Team
    * @description Groups of organization members that gives permissions on specified repositories.
    */
  var team: Membersurl
  
  /**
    * Team Discussion
    * @description A team discussion is a persistent record of a free-form conversation within a team.
    */
  var `team-discussion`: Bodyversion
  
  /**
    * Team Discussion Comment
    * @description A reply to a discussion within a team.
    */
  var `team-discussion-comment`: Discussionurl
  
  /**
    * Full Team
    * @description Groups of organization members that gives permissions on specified repositories.
    */
  var `team-full`: Memberscount
  
  /**
    * Team Membership
    * @description Team Membership
    */
  var `team-membership`: RoleState
  
  /**
    * Team Organization
    * @description Team Organization
    */
  var `team-organization`: Company
  
  /**
    * Team Project
    * @description A team's access to a project.
    */
  var `team-project`: Number
  
  /**
    * Team Repository
    * @description A team's access to a repository.
    */
  var `team-repository`: Cloneurl
  
  /**
    * Team Simple
    * @description Groups of organization members that gives permissions on specified repositories.
    */
  var `team-simple`: Ldapdn
  
  /**
    * Thread
    * @description Thread
    */
  var thread: Repository
  
  /**
    * Thread Subscription
    * @description Thread Subscription
    */
  var `thread-subscription`: Repositoryurl
  
  /**
    * Timeline Assigned Issue Event
    * @description Timeline Assigned Issue Event
    */
  var `timeline-assigned-issue-event`: AssigneeCommitid
  
  /**
    * Timeline Comment Event
    * @description Timeline Comment Event
    */
  var `timeline-comment-event`: ActorAuthorassociation
  
  /**
    * Timeline Commit Commented Event
    * @description Timeline Commit Commented Event
    */
  var `timeline-commit-commented-event`: CommentsCommitid
  
  /**
    * Timeline Committed Event
    * @description Timeline Committed Event
    */
  var `timeline-committed-event`: CommitterEvent
  
  /**
    * Timeline Cross Referenced Event
    * @description Timeline Cross Referenced Event
    */
  var `timeline-cross-referenced-event`: ActorCreatedat
  
  /**
    * Timeline Event
    * @description Timeline Event
    */
  var `timeline-issue-events`: EventId_ | IdMilestone | PerformedviagithubappRename | Requestedteam | CreatedatDismissedreview | IdLockreason | PerformedviagithubappProjectcard | ProjectcardUrl | BodyBodyhtml | EventSource | CommitterEvent | Submittedat | EventNodeid | CommitidEvent | PerformedviagithubappUrl | PerformedviagithubappStatereason
  
  /**
    * Timeline Line Commented Event
    * @description Timeline Line Commented Event
    */
  var `timeline-line-commented-event`: CommentsEvent
  
  /**
    * Timeline Reviewed Event
    * @description Timeline Reviewed Event
    */
  var `timeline-reviewed-event`: Pullrequesturl
  
  /**
    * Timeline Unassigned Issue Event
    * @description Timeline Unassigned Issue Event
    */
  var `timeline-unassigned-issue-event`: AssigneeCommitid
  
  /**
    * Topic
    * @description A topic aggregates entities that are related to a subject.
    */
  var topic: Names
  
  /**
    * Topic Search Result Item
    * @description Topic Search Result Item
    */
  var `topic-search-result-item`: Aliases
  
  /** Traffic */
  var traffic: Count
  
  /**
    * Unassigned Issue Event
    * @description Unassigned Issue Event
    */
  var `unassigned-issue-event`: AssigneeAssigner
  
  /**
    * Unlabeled Issue Event
    * @description Unlabeled Issue Event
    */
  var `unlabeled-issue-event`: ActorCommitid
  
  /**
    * User Marketplace Purchase
    * @description User Marketplace Purchase
    */
  var `user-marketplace-purchase`: Freetrialendson
  
  /**
    * User Search Result Item
    * @description User Search Result Item
    */
  var `user-search-result-item`: Followers
  
  /**
    * Validation Error
    * @description Validation Error
    */
  var `validation-error`: DocumentationurlErrorsMessage
  
  /**
    * Validation Error Simple
    * @description Validation Error Simple
    */
  var `validation-error-simple`: ErrorsMessage
  
  /** Verification */
  var verification: Signature
  
  /**
    * View Traffic
    * @description View Traffic
    */
  var `view-traffic`: Views
  
  /**
    * @description The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days).
    * @example 30
    */
  var `wait-timer`: Double
  
  /** branch protection rule created event */
  var `webhook-branch-protection-rule-created`: Installation
  
  /** branch protection rule deleted event */
  var `webhook-branch-protection-rule-deleted`: Rule
  
  /** branch protection rule edited event */
  var `webhook-branch-protection-rule-edited`: Changes
  
  /** Check Run Completed Event */
  var `webhook-check-run-completed`: Checkrun
  
  /**
    * Check Run Completed Event
    * @description The check_run.completed webhook encoded with URL encoding
    */
  var `webhook-check-run-completed-form-encoded`: PayloadString
  
  /** Check Run Created Event */
  var `webhook-check-run-created`: Sender
  
  /**
    * Check Run Created Event
    * @description The check_run.created webhook encoded with URL encoding
    */
  var `webhook-check-run-created-form-encoded`: PayloadString
  
  /** Check Run Requested Action Event */
  var `webhook-check-run-requested-action`: Requestedaction
  
  /**
    * Check Run Requested Action Event
    * @description The check_run.requested_action webhook encoded with URL encoding
    */
  var `webhook-check-run-requested-action-form-encoded`: PayloadString
  
  /** Check Run Re-Requested Event */
  var `webhook-check-run-rerequested`: ActionCheckrun
  
  /**
    * Check Run Re-Requested Event
    * @description The check_run.rerequested webhook encoded with URL encoding
    */
  var `webhook-check-run-rerequested-form-encoded`: PayloadString
  
  /** check_suite completed event */
  var `webhook-check-suite-completed`: Actionsmeta
  
  /** check_suite requested event */
  var `webhook-check-suite-requested`: ActionActionsmeta
  
  /** check_suite rerequested event */
  var `webhook-check-suite-rerequested`: ActionsmetaChecksuite
  
  /** code_scanning_alert appeared_in_branch event */
  var `webhook-code-scanning-alert-appeared-in-branch`: Alert
  
  /** code_scanning_alert closed_by_user event */
  var `webhook-code-scanning-alert-closed-by-user`: Commitoid
  
  /** code_scanning_alert created event */
  var `webhook-code-scanning-alert-created`: ActionAlert
  
  /** code_scanning_alert fixed event */
  var `webhook-code-scanning-alert-fixed`: AlertCommitoid
  
  /** code_scanning_alert reopened event */
  var `webhook-code-scanning-alert-reopened`: CommitoidEnterprise
  
  /** code_scanning_alert reopened_by_user event */
  var `webhook-code-scanning-alert-reopened-by-user`: EnterpriseInstallation
  
  /** commit_comment created event */
  var `webhook-commit-comment-created`: ActionComment
  
  /**
    * Webhook Configuration
    * @description Configuration object of the webhook
    */
  var `webhook-config`: ContenttypeInsecuressl
  
  /**
    * @description The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`.
    * @example "json"
    */
  var `webhook-config-content-type`: String
  
  var `webhook-config-insecure-ssl`: String | Double
  
  /**
    * @description If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
    * @example "********"
    */
  var `webhook-config-secret`: String
  
  /**
    * Format: uri
    * @description The URL to which the payloads will be delivered.
    * @example https://example.com/webhook
    */
  var `webhook-config-url`: String
  
  /** create event */
  var `webhook-create`: Masterbranch
  
  /** delete event */
  var `webhook-delete`: Pushertype
  
  /** Dependabot alert auto-dismissed event */
  var `webhook-dependabot-alert-auto-dismissed`: AlertEnterprise
  
  /** Dependabot alert auto-reopened event */
  var `webhook-dependabot-alert-auto-reopened`: InstallationOrganization
  
  /** Dependabot alert created event */
  var `webhook-dependabot-alert-created`: OrganizationRepository
  
  /** Dependabot alert dismissed event */
  var `webhook-dependabot-alert-dismissed`: RepositorySender
  
  /** Dependabot alert fixed event */
  var `webhook-dependabot-alert-fixed`: ActionAlertEnterprise
  
  /** Dependabot alert reintroduced event */
  var `webhook-dependabot-alert-reintroduced`: AlertEnterpriseInstallation
  
  /** Dependabot alert reopened event */
  var `webhook-dependabot-alert-reopened`: EnterpriseInstallationOrganization
  
  /** deploy_key created event */
  var `webhook-deploy-key-created`: ActionEnterprise
  
  /** deploy_key deleted event */
  var `webhook-deploy-key-deleted`: InstallationKey
  
  /** deployment created event */
  var `webhook-deployment-created`: Workflow
  
  /** deployment protection rule requested event */
  var `webhook-deployment-protection-rule-requested`: Deploymentcallbackurl
  
  /** deployment_status created event */
  var `webhook-deployment-status-created`: Deploymentstatus
  
  /** discussion answered event */
  var `webhook-discussion-answered`: Answer
  
  /** discussion category changed event */
  var `webhook-discussion-category-changed`: Discussion
  
  /** discussion closed event */
  var `webhook-discussion-closed`: ActionDiscussion
  
  /** discussion_comment created event */
  var `webhook-discussion-comment-created`: CommentDiscussion
  
  /** discussion_comment deleted event */
  var `webhook-discussion-comment-deleted`: DiscussionEnterprise
  
  /** discussion_comment edited event */
  var `webhook-discussion-comment-edited`: ActionChanges
  
  /** discussion created event */
  var `webhook-discussion-created`: ActionDiscussionEnterprise
  
  /** discussion deleted event */
  var `webhook-discussion-deleted`: DiscussionEnterpriseInstallation
  
  /** discussion edited event */
  var `webhook-discussion-edited`: ChangesDiscussion
  
  /** discussion labeled event */
  var `webhook-discussion-labeled`: InstallationLabel
  
  /** discussion locked event */
  var `webhook-discussion-locked`: InstallationOrganizationRepository
  
  /** discussion pinned event */
  var `webhook-discussion-pinned`: OrganizationRepositorySender
  
  /** discussion reopened event */
  var `webhook-discussion-reopened`: ActionDiscussionEnterpriseInstallation
  
  /** discussion transferred event */
  var `webhook-discussion-transferred`: ActionChangesDiscussion
  
  /** discussion unanswered event */
  var `webhook-discussion-unanswered`: Oldanswer
  
  /** discussion unlabeled event */
  var `webhook-discussion-unlabeled`: LabelOrganization
  
  /** discussion unlocked event */
  var `webhook-discussion-unlocked`: DiscussionEnterpriseInstallationOrganization
  
  /** discussion unpinned event */
  var `webhook-discussion-unpinned`: EnterpriseInstallationOrganizationRepository
  
  /**
    * fork event
    * @description A user forks a repository.
    */
  var `webhook-fork`: Forkee
  
  /** github_app_authorization revoked event */
  var `webhook-github-app-authorization-revoked`: ActionEnterpriseInstallation
  
  /** gollum event */
  var `webhook-gollum`: Pages
  
  /** installation created event */
  var `webhook-installation-created`: Requester
  
  /** installation deleted event */
  var `webhook-installation-deleted`: OrganizationRepositories
  
  /** installation new_permissions_accepted event */
  var `webhook-installation-new-permissions-accepted`: RepositoriesRepository
  
  /** installation_repositories added event */
  var `webhook-installation-repositories-added`: Repositoriesadded
  
  /** installation_repositories removed event */
  var `webhook-installation-repositories-removed`: Repositoriesremoved
  
  /** installation suspend event */
  var `webhook-installation-suspend`: RepositoryRequester
  
  var `webhook-installation-target-renamed`: Targettype
  
  /** installation unsuspend event */
  var `webhook-installation-unsuspend`: RequesterSender
  
  /** issue_comment created event */
  var `webhook-issue-comment-created`: CommentEnterprise
  
  /** issue_comment deleted event */
  var `webhook-issue-comment-deleted`: InstallationIssue
  
  /** issue_comment edited event */
  var `webhook-issue-comment-edited`: ChangesComment
  
  /** issues assigned event */
  var `webhook-issues-assigned`: ActionAssignee
  
  /** issues closed event */
  var `webhook-issues-closed`: IssueOrganization
  
  /** issues deleted event */
  var `webhook-issues-deleted`: EnterpriseInstallationIssue
  
  /** issues demilestoned event */
  var `webhook-issues-demilestoned`: IssueMilestone
  
  /** issues edited event */
  var `webhook-issues-edited`: ChangesEnterprise
  
  /** issues labeled event */
  var `webhook-issues-labeled`: IssueLabel
  
  /** issues locked event */
  var `webhook-issues-locked`: InstallationIssueOrganization
  
  /** issues milestoned event */
  var `webhook-issues-milestoned`: MilestoneOrganization
  
  /** issues opened event */
  var `webhook-issues-opened`: ActionChangesEnterprise
  
  /** issues pinned event */
  var `webhook-issues-pinned`: IssueOrganizationRepository
  
  /** issues reopened event */
  var `webhook-issues-reopened`: ActionEnterpriseInstallationIssue
  
  /** issues transferred event */
  var `webhook-issues-transferred`: ChangesEnterpriseInstallation
  
  /** issues unassigned event */
  var `webhook-issues-unassigned`: AssigneeEnterprise
  
  /** issues unlabeled event */
  var `webhook-issues-unlabeled`: InstallationIssueLabel
  
  /** issues unlocked event */
  var `webhook-issues-unlocked`: EnterpriseInstallationIssueOrganization
  
  /** issues unpinned event */
  var `webhook-issues-unpinned`: InstallationIssueOrganizationRepository
  
  /** label created event */
  var `webhook-label-created`: EnterpriseInstallationLabel
  
  /** label deleted event */
  var `webhook-label-deleted`: InstallationLabelOrganization
  
  /** label edited event */
  var `webhook-label-edited`: LabelOrganizationRepository
  
  /** marketplace_purchase cancelled event */
  var `webhook-marketplace-purchase-cancelled`: Marketplacepurchase
  
  /** marketplace_purchase changed event */
  var `webhook-marketplace-purchase-changed`: Previousmarketplacepurchase
  
  /** marketplace_purchase pending_change event */
  var `webhook-marketplace-purchase-pending-change`: ActionEffectivedate
  
  /** marketplace_purchase pending_change_cancelled event */
  var `webhook-marketplace-purchase-pending-change-cancelled`: EffectivedateEnterprise
  
  /** marketplace_purchase purchased event */
  var `webhook-marketplace-purchase-purchased`: InstallationMarketplacepurchase
  
  /** member added event */
  var `webhook-member-added`: Member
  
  /** member edited event */
  var `webhook-member-edited`: InstallationMember
  
  /** member removed event */
  var `webhook-member-removed`: MemberOrganization
  
  /** membership added event */
  var `webhook-membership-added`: Team
  
  /** membership removed event */
  var `webhook-membership-removed`: RepositoryScope
  
  var `webhook-merge-group-checks-requested`: Mergegroup
  
  var `webhook-merge-group-destroyed`: ActionInstallation
  
  /** meta deleted event */
  var `webhook-meta-deleted`: Hook
  
  /** milestone closed event */
  var `webhook-milestone-closed`: InstallationMilestone
  
  /** milestone created event */
  var `webhook-milestone-created`: EnterpriseInstallationMilestone
  
  /** milestone deleted event */
  var `webhook-milestone-deleted`: InstallationMilestoneOrganization
  
  /** milestone edited event */
  var `webhook-milestone-edited`: MilestoneOrganizationRepository
  
  /** milestone opened event */
  var `webhook-milestone-opened`: ActionEnterpriseInstallationMilestone
  
  /** org_block blocked event */
  var `webhook-org-block-blocked`: Blockeduser
  
  /** org_block unblocked event */
  var `webhook-org-block-unblocked`: ActionBlockeduser
  
  /** organization deleted event */
  var `webhook-organization-deleted`: Membership
  
  /** organization member_added event */
  var `webhook-organization-member-added`: InstallationMembership
  
  /** organization member_invited event */
  var `webhook-organization-member-invited`: Invitation
  
  /** organization member_removed event */
  var `webhook-organization-member-removed`: MembershipOrganization
  
  /** organization renamed event */
  var `webhook-organization-renamed`: EnterpriseInstallationMembership
  
  /** package published event */
  var `webhook-package-published`: OrganizationPackage
  
  /** package updated event */
  var `webhook-package-updated`: PackageRepository
  
  /** page_build event */
  var `webhook-page-build`: Build
  
  /** personal_access_token_request approved event */
  var `webhook-personal-access-token-request-approved`: Personalaccesstokenrequest
  
  /** personal_access_token_request cancelled event */
  var `webhook-personal-access-token-request-cancelled`: OrganizationPersonalaccesstokenrequest
  
  /** personal_access_token_request created event */
  var `webhook-personal-access-token-request-created`: PersonalaccesstokenrequestSender
  
  /** personal_access_token_request denied event */
  var `webhook-personal-access-token-request-denied`: ActionInstallationOrganization
  
  var `webhook-ping`: Zen
  
  /** @description The webhooks ping payload encoded with URL encoding. */
  var `webhook-ping-form-encoded`: PayloadString
  
  /** project_card converted event */
  var `webhook-project-card-converted`: OrganizationProjectcard
  
  /** project_card created event */
  var `webhook-project-card-created`: ProjectcardRepository
  
  /** project_card deleted event */
  var `webhook-project-card-deleted`: InstallationOrganizationProjectcard
  
  /** project_card edited event */
  var `webhook-project-card-edited`: OrganizationProjectcardRepository
  
  /** project_card moved event */
  var `webhook-project-card-moved`: ProjectcardRepositorySender
  
  /** project closed event */
  var `webhook-project-closed`: Project
  
  /** project_column created event */
  var `webhook-project-column-created`: Projectcolumn
  
  /** project_column deleted event */
  var `webhook-project-column-deleted`: OrganizationProjectcolumn
  
  /** project_column edited event */
  var `webhook-project-column-edited`: ProjectcolumnRepository
  
  /** project_column moved event */
  var `webhook-project-column-moved`: InstallationOrganizationProjectcolumn
  
  /** project created event */
  var `webhook-project-created`: OrganizationProject
  
  /** project deleted event */
  var `webhook-project-deleted`: ProjectRepository
  
  /** project edited event */
  var `webhook-project-edited`: InstallationOrganizationProject
  
  /** project reopened event */
  var `webhook-project-reopened`: OrganizationProjectRepository
  
  /** Projects v2 Item Archived Event */
  var `webhook-projects-v2-item-archived`: Projectsv2item
  
  /** Projects v2 Item Converted Event */
  var `webhook-projects-v2-item-converted`: ChangesInstallation
  
  /** Projects v2 Item Created Event */
  var `webhook-projects-v2-item-created`: OrganizationProjectsv2item
  
  /** Projects v2 Item Deleted Event */
  var `webhook-projects-v2-item-deleted`: Projectsv2itemSender
  
  /** Projects v2 Item Edited Event */
  var `webhook-projects-v2-item-edited`: ActionChangesInstallation
  
  /** Projects v2 Item Reordered Event */
  var `webhook-projects-v2-item-reordered`: ChangesInstallationOrganization
  
  /** Projects v2 Item Restored Event */
  var `webhook-projects-v2-item-restored`: InstallationOrganizationProjectsv2item
  
  /** Projects v2 Project Closed Event */
  var `webhook-projects-v2-project-closed`: Projectsv2
  
  /** @description A project was created */
  var `webhook-projects-v2-project-created`: ActionOrganization
  
  /** Projects v2 Project Deleted Event */
  var `webhook-projects-v2-project-deleted`: OrganizationProjectsv2
  
  /** Projects v2 Project Edited Event */
  var `webhook-projects-v2-project-edited`: ChangesOrganization
  
  /** Projects v2 Project Reopened Event */
  var `webhook-projects-v2-project-reopened`: Projectsv2Sender
  
  /** public event */
  var `webhook-public`: InstallationOrganizationRepositorySender
  
  /** pull_request assigned event */
  var `webhook-pull-request-assigned`: InstallationNumber
  
  /** pull_request auto_merge_disabled event */
  var `webhook-pull-request-auto-merge-disabled`: NumberOrganization
  
  /** pull_request auto_merge_enabled event */
  var `webhook-pull-request-auto-merge-enabled`: OrganizationPullrequest
  
  /** pull_request closed event */
  var `webhook-pull-request-closed`: PullrequestRepository
  
  /** pull_request converted_to_draft event */
  var `webhook-pull-request-converted-to-draft`: EnterpriseInstallationNumber
  
  /** pull_request demilestoned event */
  var `webhook-pull-request-demilestoned`: EnterpriseMilestone
  
  /** pull_request dequeued event */
  var `webhook-pull-request-dequeued`: PullrequestReason
  
  /** pull_request edited event */
  var `webhook-pull-request-edited`: InstallationNumberOrganization
  
  /** pull_request enqueued event */
  var `webhook-pull-request-enqueued`: NumberOrganizationPullrequest
  
  /** pull_request labeled event */
  var `webhook-pull-request-labeled`: LabelNumber
  
  /** pull_request locked event */
  var `webhook-pull-request-locked`: OrganizationPullrequestRepository
  
  /** pull_request milestoned event */
  var `webhook-pull-request-milestoned`: MilestoneNumber_
  
  /** pull_request opened event */
  var `webhook-pull-request-opened`: PullrequestRepositorySender
  
  /** pull_request ready_for_review event */
  var `webhook-pull-request-ready-for-review`: ActionEnterpriseInstallationNumber
  
  /** pull_request reopened event */
  var `webhook-pull-request-reopened`: EnterpriseInstallationNumberOrganization
  
  /** pull_request_review_comment created event */
  var `webhook-pull-request-review-comment-created`: ActionCommentEnterprise
  
  /** pull_request_review_comment deleted event */
  var `webhook-pull-request-review-comment-deleted`: CommentEnterpriseInstallation
  
  /** pull_request_review_comment edited event */
  var `webhook-pull-request-review-comment-edited`: ActionChangesComment
  
  /** pull_request_review dismissed event */
  var `webhook-pull-request-review-dismissed`: Review
  
  /** pull_request_review edited event */
  var `webhook-pull-request-review-edited`: RepositoryReview
  
  /** pull_request review_request_removed event */
  var `webhook-pull-request-review-request-removed`: OneOf[js.Tuple2[RepositoryRequestedreviewer, RepositoryRequestedteam]]
  
  /** pull_request review_requested event */
  var `webhook-pull-request-review-requested`: OneOf[js.Tuple2[RequestedreviewerSender, RequestedteamSender]]
  
  /** pull_request_review submitted event */
  var `webhook-pull-request-review-submitted`: ReviewSender
  
  /** pull_request_review_thread resolved event */
  var `webhook-pull-request-review-thread-resolved`: Thread
  
  /** pull_request_review_thread unresolved event */
  var `webhook-pull-request-review-thread-unresolved`: SenderThread
  
  /** pull_request synchronize event */
  var `webhook-pull-request-synchronize`: ActionAfter
  
  /** pull_request unassigned event */
  var `webhook-pull-request-unassigned`: ActionAssigneeEnterprise
  
  /** pull_request unlabeled event */
  var `webhook-pull-request-unlabeled`: InstallationLabelNumber
  
  /** pull_request unlocked event */
  var `webhook-pull-request-unlocked`: InstallationNumberOrganizationPullrequest
  
  /** push event */
  var `webhook-push`: Compare
  
  var `webhook-registry-package-published`: Registrypackage
  
  var `webhook-registry-package-updated`: OrganizationRegistrypackage
  
  /** release created event */
  var `webhook-release-created`: Release
  
  /** release deleted event */
  var `webhook-release-deleted`: OrganizationRelease
  
  /** release edited event */
  var `webhook-release-edited`: ReleaseRepository
  
  /** release prereleased event */
  var `webhook-release-prereleased`: InstallationOrganizationRelease
  
  /** release published event */
  var `webhook-release-published`: OrganizationReleaseRepository
  
  /** release released event */
  var `webhook-release-released`: ReleaseRepositorySender
  
  /** release unpublished event */
  var `webhook-release-unpublished`: ActionEnterpriseInstallationOrganization
  
  /** Repository advisory published event */
  var `webhook-repository-advisory-published`: Repositoryadvisory
  
  /** Repository advisory reported event */
  var `webhook-repository-advisory-reported`: RepositoryRepositoryadvisory
  
  /** repository archived event */
  var `webhook-repository-archived`: ActionEnterpriseInstallationOrganizationRepository
  
  /** repository created event */
  var `webhook-repository-created`: EnterpriseInstallationOrganizationRepositorySender
  
  /** repository deleted event */
  var `webhook-repository-deleted`: ActionEnterpriseInstallationOrganizationRepositorySender
  
  /** repository_dispatch event */
  var `webhook-repository-dispatch-sample`: ActionBranch
  
  /** repository edited event */
  var `webhook-repository-edited`: ActionChangesEnterpriseInstallation
  
  /** repository_import event */
  var `webhook-repository-import`: SenderStatus
  
  /** repository privatized event */
  var `webhook-repository-privatized`: RepositoryAllowupdatebranch
  
  /** repository publicized event */
  var `webhook-repository-publicized`: SenderAvatarurl
  
  /** repository renamed event */
  var `webhook-repository-renamed`: ChangesEnterpriseInstallationOrganization
  
  /** repository transferred event */
  var `webhook-repository-transferred`: ActionChangesEnterpriseInstallationOrganization
  
  /** repository unarchived event */
  var `webhook-repository-unarchived`: OrganizationRepositoryAllowupdatebranch
  
  /** repository_vulnerability_alert create event */
  var `webhook-repository-vulnerability-alert-create`: ActionAlertEnterpriseInstallation
  
  /** repository_vulnerability_alert dismiss event */
  var `webhook-repository-vulnerability-alert-dismiss`: AlertEnterpriseInstallationOrganization
  
  /** repository_vulnerability_alert reopen event */
  var `webhook-repository-vulnerability-alert-reopen`: ActionAlertEnterpriseInstallationOrganization
  
  /** repository_vulnerability_alert resolve event */
  var `webhook-repository-vulnerability-alert-resolve`: AlertEnterpriseInstallationOrganizationRepository
  
  /** Ruby Gems metadata */
  var `webhook-rubygems-metadata`: Homepage
  
  /** secret_scanning_alert created event */
  var `webhook-secret-scanning-alert-created`: ActionAlertEnterpriseInstallationOrganizationRepository
  
  /** Secret Scanning Alert Location Created Event */
  var `webhook-secret-scanning-alert-location-created`: AlertInstallation
  
  /** Secret Scanning Alert Location Created Event */
  var `webhook-secret-scanning-alert-location-created-form-encoded`: PayloadString
  
  /** secret_scanning_alert reopened event */
  var `webhook-secret-scanning-alert-reopened`: AlertEnterpriseInstallationOrganizationRepositorySender
  
  /** secret_scanning_alert resolved event */
  var `webhook-secret-scanning-alert-resolved`: ActionAlertEnterpriseInstallationOrganizationRepositorySender
  
  /** secret_scanning_alert revoked event */
  var `webhook-secret-scanning-alert-revoked`: AlertPushprotectionbypassedat
  
  /** security_advisory published event */
  var `webhook-security-advisory-published`: RepositorySecurityadvisory
  
  /** security_advisory updated event */
  var `webhook-security-advisory-updated`: SecurityadvisorySender
  
  /** security_advisory withdrawn event */
  var `webhook-security-advisory-withdrawn`: OrganizationRepositorySecurityadvisory
  
  /** security_and_analysis event */
  var `webhook-security-and-analysis`: ChangesEnterpriseInstallationOrganizationRepository
  
  /** sponsorship cancelled event */
  var `webhook-sponsorship-cancelled`: Sponsorship
  
  /** sponsorship created event */
  var `webhook-sponsorship-created`: SenderSponsorship
  
  /** sponsorship edited event */
  var `webhook-sponsorship-edited`: RepositorySenderSponsorship
  
  /** sponsorship pending_cancellation event */
  var `webhook-sponsorship-pending-cancellation`: ActionEffectivedateEnterprise
  
  /** sponsorship pending_tier_change event */
  var `webhook-sponsorship-pending-tier-change`: ChangesEffectivedate
  
  /** sponsorship tier_changed event */
  var `webhook-sponsorship-tier-changed`: OrganizationRepositorySenderSponsorship
  
  /** star created event */
  var `webhook-star-created`: SenderStarredat
  
  /** star deleted event */
  var `webhook-star-deleted`: RepositorySenderStarredat
  
  /** status event */
  var `webhook-status`: Branches
  
  /** team_add event */
  var `webhook-team-add`: SenderTeam
  
  /** team added_to_repository event */
  var `webhook-team-added-to-repository`: RepositorySenderTeam
  
  /** team created event */
  var `webhook-team-created`: OrganizationRepositorySenderTeam
  
  /** team deleted event */
  var `webhook-team-deleted`: InstallationOrganizationRepositorySenderTeam
  
  /** team edited event */
  var `webhook-team-edited`: ActionChangesEnterpriseInstallationOrganizationRepository
  
  /** team removed_from_repository event */
  var `webhook-team-removed-from-repository`: EnterpriseInstallationOrganizationRepositorySenderTeam
  
  /** watch started event */
  var `webhook-watch-started`: RepositoryAllowupdatebranchSenderAvatarurl
  
  /** workflow_dispatch event */
  var `webhook-workflow-dispatch`: EnterpriseInputs
  
  /** workflow_job completed event */
  var `webhook-workflow-job-completed`: Workflowjob
  
  /** workflow_job in_progress event */
  var `webhook-workflow-job-in-progress`: ActionDeployment
  
  /** workflow_job queued event */
  var `webhook-workflow-job-queued`: DeploymentEnterprise
  
  /** workflow_job waiting event */
  var `webhook-workflow-job-waiting`: SenderWorkflowjob
  
  /** workflow_run completed event */
  var `webhook-workflow-run-completed`: Workflowrun
  
  /** workflow_run in_progress event */
  var `webhook-workflow-run-in-progress`: SenderWorkflow
  
  /** workflow_run requested event */
  var `webhook-workflow-run-requested`: WorkflowWorkflowrun
  
  /**
    * Workflow
    * @description A GitHub Actions workflow
    */
  var workflow: BadgeurlCreatedat
  
  /**
    * Workflow Run
    * @description An invocation of a workflow
    */
  var `workflow-run`: Artifactsurl
  
  /**
    * Workflow Run Usage
    * @description Workflow Run Usage
    */
  var `workflow-run-usage`: Rundurationms
  
  /**
    * Workflow Usage
    * @description Workflow Usage
    */
  var `workflow-usage`: Billable
}
object Actionsbillingusage {
  
  inline def apply(
    _package: Versioncount,
    `actions-billing-usage`: Includedminutes,
    `actions-cache-list`: Actionscaches,
    `actions-cache-usage-by-repository`: Activecachescount,
    `actions-cache-usage-org-enterprise`: Totalactivecachescount,
    `actions-can-approve-pull-request-reviews`: Boolean,
    `actions-default-workflow-permissions`: read | write,
    `actions-enabled`: Boolean,
    `actions-get-default-workflow-permissions`: Canapprovepullrequestreviews,
    `actions-organization-permissions`: Enabledrepositories,
    `actions-public-key`: CreatedatId,
    `actions-repository-permissions`: Selectedactionsurl,
    `actions-secret`: NameUpdatedat,
    `actions-set-default-workflow-permissions`: Defaultworkflowpermissions,
    `actions-variable`: UpdatedatValue,
    `actions-workflow-access-to-repository`: Accesslevel,
    actor: Displaylogin,
    `added-to-project-issue-event`: Projectcard,
    `alert-created-at`: String,
    `alert-html-url`: String,
    `alert-instances-url`: String,
    `alert-number`: Double,
    `alert-updated-at`: String,
    `alert-url`: String,
    `allowed-actions`: all | local_only | selected,
    `api-overview`: Api,
    `app-permissions`: Administration,
    artifact: Archivedownloadurl,
    `assigned-issue-event`: ActorAssignee,
    `authentication-token`: Singlefile,
    `author-association`: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    authorization: App,
    autolink: Keyprefix,
    `base-gist`: Commentsurl,
    `basic-error`: DocumentationurlMessage,
    blob: Highlightedcontent,
    `branch-protection`: Allowforcepushes,
    `branch-restriction-policy`: Appsurl,
    `branch-short`: CommitName,
    `branch-with-protection`: Protection,
    `check-annotation`: Blobhref,
    `check-run`: Checksuite,
    `check-run-with-simple-check-suite`: Deployment,
    `check-suite`: Checkrunsurl,
    `check-suite-preference`: Preferences,
    `clone-traffic`: Clones,
    `code-frequency-stat`: js.Array[Double],
    `code-of-conduct`: BodyHtmlurl,
    `code-of-conduct-simple`: HtmlurlKey,
    `code-scanning-alert`: Fixedat,
    `code-scanning-alert-environment`: String,
    `code-scanning-alert-instance`: Analysiskey,
    `code-scanning-alert-items`: Dismissedby,
    `code-scanning-alert-location`: Endcolumn,
    `code-scanning-alert-rule`: Fulldescription,
    `code-scanning-alert-rule-summary`: DescriptionId,
    `code-scanning-alert-set-state`: open | dismissed,
    `code-scanning-alert-severity`: critical | high | medium | low | warning | note | error,
    `code-scanning-alert-state`: open | closed | dismissed | fixed,
    `code-scanning-analysis`: Deletable,
    `code-scanning-analysis-analysis-key`: String,
    `code-scanning-analysis-category`: String,
    `code-scanning-analysis-commit-sha`: String,
    `code-scanning-analysis-created-at`: String,
    `code-scanning-analysis-deletion`: Confirmdeleteurl,
    `code-scanning-analysis-environment`: String,
    `code-scanning-analysis-sarif-file`: String,
    `code-scanning-analysis-sarif-id`: String,
    `code-scanning-analysis-tool`: Guid,
    `code-scanning-analysis-tool-name`: String,
    `code-scanning-analysis-url`: String,
    `code-scanning-codeql-database`: Uploader,
    `code-scanning-default-setup`: Languages,
    `code-scanning-default-setup-update`: Querysuite,
    `code-scanning-default-setup-update-response`: Runurl,
    `code-scanning-organization-alert-items`: Dismissedat,
    `code-scanning-ref`: String,
    `code-scanning-sarifs-receipt`: IdUrl,
    `code-scanning-sarifs-status`: Analysesurl,
    `code-search-result-item`: Filesize,
    `codeowners-errors`: ErrorsArray,
    codespace: Environmentid,
    `codespace-export-details`: Exporturl,
    `codespace-machine`: Cpus,
    `codespace-with-full-repository`: Gitstatus,
    `codespaces-org-secret`: CreatedatName,
    `codespaces-public-key`: CreatedatId,
    `codespaces-secret`: SelectedrepositoriesurlUpdatedat,
    `codespaces-user-public-key`: KeyKeyid,
    collaborator: Followingurl,
    `combined-billing-usage`: Daysleftinbillingcycle,
    `combined-commit-status`: Commiturl,
    commit: Stats,
    `commit-activity`: Days,
    `commit-comment`: Reactions,
    `commit-comparison`: Aheadby,
    `commit-search-result-item`: Textmatches,
    `community-profile`: Contentreportsenabled,
    `content-directory`: js.Array[Giturl],
    `content-file`: Submodulegiturl,
    `content-submodule`: DownloadurlGiturl,
    `content-symlink`: Target,
    `content-traffic`: Uniques,
    `content-tree`: Entries,
    contributor: Contributions,
    `contributor-activity`: Total,
    `converted-note-to-issue-issue-event`: CreatedatEvent,
    `custom-deployment-rule-app`: Integrationurl,
    `demilestoned-issue-event`: CommitidCommiturl,
    `dependabot-alert`: Dependency,
    `dependabot-alert-package`: EcosystemName,
    `dependabot-alert-security-advisory`: Cveid,
    `dependabot-alert-security-vulnerability`: Firstpatchedversion,
    `dependabot-alert-with-repository`: Autodismissedat,
    `dependabot-public-key`: KeyKeyid,
    `dependabot-secret`: NameUpdatedat,
    dependency: Dependencies,
    `dependency-graph-diff`: js.Array[Changetype],
    `dependency-graph-spdx-sbom`: Sbom,
    `deploy-key`: Addedby,
    deployment: Originalenvironment,
    `deployment-branch-policy`: NameNodeid,
    `deployment-branch-policy-name-pattern`: Name,
    `deployment-protection-rule`: AppEnabled,
    `deployment-reviewer-type`: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team,
    `deployment-simple`: Performedviagithubapp,
    `deployment-status`: Deploymenturl,
    `diff-entry`: Bloburl,
    discussion: Answerchosenat,
    email: Primary,
    `empty-object`: Record[String, scala.Nothing],
    `enabled-repositories`: all | none_ | selected,
    enterprise: Htmlurl,
    environment: Protectionrules,
    `environment-approvals`: CommentEnvironments,
    event: Public,
    feed: Currentuseractorurl,
    `file-commit`: CommitContent,
    `full-repository`: Anonymousaccessenabled,
    `gist-comment`: User,
    `gist-commit`: Version,
    `gist-history`: Changestatus,
    `gist-simple`: Forkof,
    `git-commit`: AuthorCommitter,
    `git-ref`: NodeidObject,
    `git-tag`: Tagger,
    `git-tree`: Truncated,
    `gitignore-template`: NameSource,
    `gpg-key`: Canencryptcomms,
    hook: Lastresponse,
    `hook-delivery`: Duration,
    `hook-delivery-item`: Deliveredat,
    `hook-response`: MessageStatus,
    hovercard: `523`,
    `import`: Authorscount,
    installation: Accesstokensurl,
    `installation-token`: Expiresat,
    integration: Clientsecret,
    `integration-installation-request`: Account,
    `interaction-expiry`: one_day | three_days | one_week | one_month | six_months,
    `interaction-group`: existing_users | contributors_only | collaborators_only,
    `interaction-limit`: Expiry,
    `interaction-limit-response`: Limit,
    issue: Activelockreason,
    `issue-comment`: Authorassociation,
    `issue-event`: Assigner,
    `issue-event-dismissed-review`: Dismissalcommitid,
    `issue-event-for-issue`: EventId_ | AssignerCommitid | NodeidPerformedviagithubapp | IdMilestone | PerformedviagithubappRename | Requestedteam | CreatedatDismissedreview | IdLockreason | PerformedviagithubappProjectcard | ProjectcardUrl,
    `issue-event-label`: ColorName,
    `issue-event-milestone`: TitleString,
    `issue-event-project-card`: Previouscolumnname,
    `issue-event-rename`: From,
    `issue-search-result-item`: Labelsurl,
    job: Checkrunurl,
    key: IdKey,
    `key-simple`: KeyString,
    label: DefaultDescription,
    `label-search-result-item`: NodeidScore,
    `labeled-issue-event`: ActorCommitid,
    language: StringDictionary[js.UndefOr[Double]],
    license: Implementation,
    `license-content`: ContentDownloadurl,
    `license-simple`: Nodeid,
    link: HrefString,
    `link-with-type`: Href,
    `locked-issue-event`: CommiturlCreatedat,
    manifest: File,
    `marketplace-account`: Organizationbillingemail,
    `marketplace-listing-plan`: Accountsurl,
    `marketplace-purchase`: Login,
    `merge-group`: Baseref,
    `merged-upstream`: Basebranch,
    metadata: StringDictionary[js.UndefOr[String | Double | Boolean | Null]],
    migration: Excludemetadata,
    milestone: Closedat,
    `milestoned-issue-event`: CommitidCommiturl,
    `minimal-repository`: Blobsurl,
    `moved-column-in-project-issue-event`: Projectcard,
    `oidc-custom-sub`: IncludeclaimkeysArray,
    `oidc-custom-sub-repo`: Includeclaimkeys,
    `org-hook`: Deliveriesurl,
    `org-membership`: Organizationurl,
    `org-ruleset-conditions`: Refname & Repositoryname,
    `organization-actions-secret`: CreatedatName,
    `organization-actions-variable`: NameSelectedrepositoriesurl,
    `organization-dependabot-secret`: CreatedatName,
    `organization-full`: Billingemail,
    `organization-invitation`: Failedat,
    `organization-programmatic-access-grant`: Accessgrantedat,
    `organization-programmatic-access-grant-request`: Tokenexpired,
    `organization-secret-scanning-alert`: Locationsurl,
    `organization-simple`: Hooksurl,
    `package-version`: Deletedat,
    `packages-billing-usage`: Includedgigabytesbandwidth,
    page: Cname,
    `page-build`: Error,
    `page-build-status`: StatusUrl,
    `page-deployment`: Pageurl,
    `pages-health-check`: Altdomain,
    `pages-https-certificate`: Domains,
    `pages-source-hash`: PathString,
    `participation-stats`: AllOwner,
    `pending-deployment`: Currentusercanapprove,
    `personal-access-token-request`: Permissionsadded,
    `porter-author`: Importurl,
    `porter-large-file`: Oid,
    `private-user`: Businessplus,
    `private-vulnerability-report-create`: Cweids,
    project: Columnsurl,
    `project-card`: Columnname,
    `project-collaborator-permission`: PermissionUser,
    `project-column`: Cardsurl,
    `projects-v2`: Deletedby,
    `projects-v2-item`: Archivedat,
    `projects-v2-item-content-type`: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Issue | PullRequest | DraftIssue,
    `protected-branch`: Blockcreations,
    `protected-branch-admin-enforced`: EnabledUrl,
    `protected-branch-pull-request-review`: Dismissalrestrictions,
    `protected-branch-required-status-check`: Contextsurl,
    `public-user`: Blog,
    `pull-request`: Changedfiles,
    `pull-request-merge-result`: Merged,
    `pull-request-minimal`: HeadId,
    `pull-request-review`: BodyhtmlBodytext,
    `pull-request-review-comment`: Diffhunk,
    `pull-request-review-request`: UsersArray,
    `pull-request-simple`: Issueurl,
    `rate-limit`: Remaining,
    `rate-limit-overview`: Rate,
    reaction: ContentCreatedat,
    `reaction-rollup`: Confused,
    `referenced-workflow`: PathRef,
    `referrer-traffic`: Referrer,
    release: Assets
  ): Actionsbillingusage = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], artifact = artifact.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], autolink = autolink.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], codespace = codespace.asInstanceOf[js.Any], collaborator = collaborator.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], contributor = contributor.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], discussion = discussion.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], feed = feed.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], hovercard = hovercard.asInstanceOf[js.Any], installation = installation.asInstanceOf[js.Any], integration = integration.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], migration = migration.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reaction = reaction.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-billing-usage")(`actions-billing-usage`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-cache-list")(`actions-cache-list`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-cache-usage-by-repository")(`actions-cache-usage-by-repository`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-cache-usage-org-enterprise")(`actions-cache-usage-org-enterprise`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-can-approve-pull-request-reviews")(`actions-can-approve-pull-request-reviews`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-default-workflow-permissions")(`actions-default-workflow-permissions`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-enabled")(`actions-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-get-default-workflow-permissions")(`actions-get-default-workflow-permissions`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-organization-permissions")(`actions-organization-permissions`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-public-key")(`actions-public-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-repository-permissions")(`actions-repository-permissions`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-secret")(`actions-secret`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-set-default-workflow-permissions")(`actions-set-default-workflow-permissions`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-variable")(`actions-variable`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-workflow-access-to-repository")(`actions-workflow-access-to-repository`.asInstanceOf[js.Any])
    __obj.updateDynamic("added-to-project-issue-event")(`added-to-project-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-created-at")(`alert-created-at`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-html-url")(`alert-html-url`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-instances-url")(`alert-instances-url`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-number")(`alert-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-updated-at")(`alert-updated-at`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-url")(`alert-url`.asInstanceOf[js.Any])
    __obj.updateDynamic("allowed-actions")(`allowed-actions`.asInstanceOf[js.Any])
    __obj.updateDynamic("api-overview")(`api-overview`.asInstanceOf[js.Any])
    __obj.updateDynamic("app-permissions")(`app-permissions`.asInstanceOf[js.Any])
    __obj.updateDynamic("assigned-issue-event")(`assigned-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("authentication-token")(`authentication-token`.asInstanceOf[js.Any])
    __obj.updateDynamic("author-association")(`author-association`.asInstanceOf[js.Any])
    __obj.updateDynamic("base-gist")(`base-gist`.asInstanceOf[js.Any])
    __obj.updateDynamic("basic-error")(`basic-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("branch-protection")(`branch-protection`.asInstanceOf[js.Any])
    __obj.updateDynamic("branch-restriction-policy")(`branch-restriction-policy`.asInstanceOf[js.Any])
    __obj.updateDynamic("branch-short")(`branch-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("branch-with-protection")(`branch-with-protection`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-annotation")(`check-annotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-run")(`check-run`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-run-with-simple-check-suite")(`check-run-with-simple-check-suite`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-suite")(`check-suite`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-suite-preference")(`check-suite-preference`.asInstanceOf[js.Any])
    __obj.updateDynamic("clone-traffic")(`clone-traffic`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-frequency-stat")(`code-frequency-stat`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-of-conduct")(`code-of-conduct`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-of-conduct-simple")(`code-of-conduct-simple`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert")(`code-scanning-alert`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-environment")(`code-scanning-alert-environment`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-instance")(`code-scanning-alert-instance`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-items")(`code-scanning-alert-items`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-location")(`code-scanning-alert-location`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-rule")(`code-scanning-alert-rule`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-rule-summary")(`code-scanning-alert-rule-summary`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-set-state")(`code-scanning-alert-set-state`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-severity")(`code-scanning-alert-severity`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-alert-state")(`code-scanning-alert-state`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis")(`code-scanning-analysis`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-analysis-key")(`code-scanning-analysis-analysis-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-category")(`code-scanning-analysis-category`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-commit-sha")(`code-scanning-analysis-commit-sha`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-created-at")(`code-scanning-analysis-created-at`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-deletion")(`code-scanning-analysis-deletion`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-environment")(`code-scanning-analysis-environment`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-sarif-file")(`code-scanning-analysis-sarif-file`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-sarif-id")(`code-scanning-analysis-sarif-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-tool")(`code-scanning-analysis-tool`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-tool-name")(`code-scanning-analysis-tool-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-analysis-url")(`code-scanning-analysis-url`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-codeql-database")(`code-scanning-codeql-database`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-default-setup")(`code-scanning-default-setup`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-default-setup-update")(`code-scanning-default-setup-update`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-default-setup-update-response")(`code-scanning-default-setup-update-response`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-organization-alert-items")(`code-scanning-organization-alert-items`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-ref")(`code-scanning-ref`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-sarifs-receipt")(`code-scanning-sarifs-receipt`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-scanning-sarifs-status")(`code-scanning-sarifs-status`.asInstanceOf[js.Any])
    __obj.updateDynamic("code-search-result-item")(`code-search-result-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("codeowners-errors")(`codeowners-errors`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespace-export-details")(`codespace-export-details`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespace-machine")(`codespace-machine`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespace-with-full-repository")(`codespace-with-full-repository`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespaces-org-secret")(`codespaces-org-secret`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespaces-public-key")(`codespaces-public-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespaces-secret")(`codespaces-secret`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespaces-user-public-key")(`codespaces-user-public-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("combined-billing-usage")(`combined-billing-usage`.asInstanceOf[js.Any])
    __obj.updateDynamic("combined-commit-status")(`combined-commit-status`.asInstanceOf[js.Any])
    __obj.updateDynamic("commit-activity")(`commit-activity`.asInstanceOf[js.Any])
    __obj.updateDynamic("commit-comment")(`commit-comment`.asInstanceOf[js.Any])
    __obj.updateDynamic("commit-comparison")(`commit-comparison`.asInstanceOf[js.Any])
    __obj.updateDynamic("commit-search-result-item")(`commit-search-result-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("community-profile")(`community-profile`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-directory")(`content-directory`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-file")(`content-file`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-submodule")(`content-submodule`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-symlink")(`content-symlink`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-traffic")(`content-traffic`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-tree")(`content-tree`.asInstanceOf[js.Any])
    __obj.updateDynamic("contributor-activity")(`contributor-activity`.asInstanceOf[js.Any])
    __obj.updateDynamic("converted-note-to-issue-issue-event")(`converted-note-to-issue-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("custom-deployment-rule-app")(`custom-deployment-rule-app`.asInstanceOf[js.Any])
    __obj.updateDynamic("demilestoned-issue-event")(`demilestoned-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert")(`dependabot-alert`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-package")(`dependabot-alert-package`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-security-advisory")(`dependabot-alert-security-advisory`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-security-vulnerability")(`dependabot-alert-security-vulnerability`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-with-repository")(`dependabot-alert-with-repository`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-public-key")(`dependabot-public-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-secret")(`dependabot-secret`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependency-graph-diff")(`dependency-graph-diff`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependency-graph-spdx-sbom")(`dependency-graph-spdx-sbom`.asInstanceOf[js.Any])
    __obj.updateDynamic("deploy-key")(`deploy-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-branch-policy")(`deployment-branch-policy`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-branch-policy-name-pattern")(`deployment-branch-policy-name-pattern`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-protection-rule")(`deployment-protection-rule`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-reviewer-type")(`deployment-reviewer-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-simple")(`deployment-simple`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-status")(`deployment-status`.asInstanceOf[js.Any])
    __obj.updateDynamic("diff-entry")(`diff-entry`.asInstanceOf[js.Any])
    __obj.updateDynamic("empty-object")(`empty-object`.asInstanceOf[js.Any])
    __obj.updateDynamic("enabled-repositories")(`enabled-repositories`.asInstanceOf[js.Any])
    __obj.updateDynamic("environment-approvals")(`environment-approvals`.asInstanceOf[js.Any])
    __obj.updateDynamic("file-commit")(`file-commit`.asInstanceOf[js.Any])
    __obj.updateDynamic("full-repository")(`full-repository`.asInstanceOf[js.Any])
    __obj.updateDynamic("gist-comment")(`gist-comment`.asInstanceOf[js.Any])
    __obj.updateDynamic("gist-commit")(`gist-commit`.asInstanceOf[js.Any])
    __obj.updateDynamic("gist-history")(`gist-history`.asInstanceOf[js.Any])
    __obj.updateDynamic("gist-simple")(`gist-simple`.asInstanceOf[js.Any])
    __obj.updateDynamic("git-commit")(`git-commit`.asInstanceOf[js.Any])
    __obj.updateDynamic("git-ref")(`git-ref`.asInstanceOf[js.Any])
    __obj.updateDynamic("git-tag")(`git-tag`.asInstanceOf[js.Any])
    __obj.updateDynamic("git-tree")(`git-tree`.asInstanceOf[js.Any])
    __obj.updateDynamic("gitignore-template")(`gitignore-template`.asInstanceOf[js.Any])
    __obj.updateDynamic("gpg-key")(`gpg-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("hook-delivery")(`hook-delivery`.asInstanceOf[js.Any])
    __obj.updateDynamic("hook-delivery-item")(`hook-delivery-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("hook-response")(`hook-response`.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("installation-token")(`installation-token`.asInstanceOf[js.Any])
    __obj.updateDynamic("integration-installation-request")(`integration-installation-request`.asInstanceOf[js.Any])
    __obj.updateDynamic("interaction-expiry")(`interaction-expiry`.asInstanceOf[js.Any])
    __obj.updateDynamic("interaction-group")(`interaction-group`.asInstanceOf[js.Any])
    __obj.updateDynamic("interaction-limit")(`interaction-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("interaction-limit-response")(`interaction-limit-response`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-comment")(`issue-comment`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-event")(`issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-event-dismissed-review")(`issue-event-dismissed-review`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-event-for-issue")(`issue-event-for-issue`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-event-label")(`issue-event-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-event-milestone")(`issue-event-milestone`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-event-project-card")(`issue-event-project-card`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-event-rename")(`issue-event-rename`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-search-result-item")(`issue-search-result-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("key-simple")(`key-simple`.asInstanceOf[js.Any])
    __obj.updateDynamic("label-search-result-item")(`label-search-result-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("labeled-issue-event")(`labeled-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-content")(`license-content`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-simple")(`license-simple`.asInstanceOf[js.Any])
    __obj.updateDynamic("link-with-type")(`link-with-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("locked-issue-event")(`locked-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("marketplace-account")(`marketplace-account`.asInstanceOf[js.Any])
    __obj.updateDynamic("marketplace-listing-plan")(`marketplace-listing-plan`.asInstanceOf[js.Any])
    __obj.updateDynamic("marketplace-purchase")(`marketplace-purchase`.asInstanceOf[js.Any])
    __obj.updateDynamic("merge-group")(`merge-group`.asInstanceOf[js.Any])
    __obj.updateDynamic("merged-upstream")(`merged-upstream`.asInstanceOf[js.Any])
    __obj.updateDynamic("milestoned-issue-event")(`milestoned-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("minimal-repository")(`minimal-repository`.asInstanceOf[js.Any])
    __obj.updateDynamic("moved-column-in-project-issue-event")(`moved-column-in-project-issue-event`.asInstanceOf[js.Any])
    __obj.updateDynamic("oidc-custom-sub")(`oidc-custom-sub`.asInstanceOf[js.Any])
    __obj.updateDynamic("oidc-custom-sub-repo")(`oidc-custom-sub-repo`.asInstanceOf[js.Any])
    __obj.updateDynamic("org-hook")(`org-hook`.asInstanceOf[js.Any])
    __obj.updateDynamic("org-membership")(`org-membership`.asInstanceOf[js.Any])
    __obj.updateDynamic("org-ruleset-conditions")(`org-ruleset-conditions`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-actions-secret")(`organization-actions-secret`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-actions-variable")(`organization-actions-variable`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-dependabot-secret")(`organization-dependabot-secret`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-full")(`organization-full`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-invitation")(`organization-invitation`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-programmatic-access-grant")(`organization-programmatic-access-grant`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-programmatic-access-grant-request")(`organization-programmatic-access-grant-request`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-secret-scanning-alert")(`organization-secret-scanning-alert`.asInstanceOf[js.Any])
    __obj.updateDynamic("organization-simple")(`organization-simple`.asInstanceOf[js.Any])
    __obj.updateDynamic("package-version")(`package-version`.asInstanceOf[js.Any])
    __obj.updateDynamic("packages-billing-usage")(`packages-billing-usage`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-build")(`page-build`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-build-status")(`page-build-status`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-deployment")(`page-deployment`.asInstanceOf[js.Any])
    __obj.updateDynamic("pages-health-check")(`pages-health-check`.asInstanceOf[js.Any])
    __obj.updateDynamic("pages-https-certificate")(`pages-https-certificate`.asInstanceOf[js.Any])
    __obj.updateDynamic("pages-source-hash")(`pages-source-hash`.asInstanceOf[js.Any])
    __obj.updateDynamic("participation-stats")(`participation-stats`.asInstanceOf[js.Any])
    __obj.updateDynamic("pending-deployment")(`pending-deployment`.asInstanceOf[js.Any])
    __obj.updateDynamic("personal-access-token-request")(`personal-access-token-request`.asInstanceOf[js.Any])
    __obj.updateDynamic("porter-author")(`porter-author`.asInstanceOf[js.Any])
    __obj.updateDynamic("porter-large-file")(`porter-large-file`.asInstanceOf[js.Any])
    __obj.updateDynamic("private-user")(`private-user`.asInstanceOf[js.Any])
    __obj.updateDynamic("private-vulnerability-report-create")(`private-vulnerability-report-create`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-card")(`project-card`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-collaborator-permission")(`project-collaborator-permission`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-column")(`project-column`.asInstanceOf[js.Any])
    __obj.updateDynamic("projects-v2")(`projects-v2`.asInstanceOf[js.Any])
    __obj.updateDynamic("projects-v2-item")(`projects-v2-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("projects-v2-item-content-type")(`projects-v2-item-content-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected-branch")(`protected-branch`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected-branch-admin-enforced")(`protected-branch-admin-enforced`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected-branch-pull-request-review")(`protected-branch-pull-request-review`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected-branch-required-status-check")(`protected-branch-required-status-check`.asInstanceOf[js.Any])
    __obj.updateDynamic("public-user")(`public-user`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-request")(`pull-request`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-request-merge-result")(`pull-request-merge-result`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-request-minimal")(`pull-request-minimal`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-request-review")(`pull-request-review`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-request-review-comment")(`pull-request-review-comment`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-request-review-request")(`pull-request-review-request`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-request-simple")(`pull-request-simple`.asInstanceOf[js.Any])
    __obj.updateDynamic("rate-limit")(`rate-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("rate-limit-overview")(`rate-limit-overview`.asInstanceOf[js.Any])
    __obj.updateDynamic("reaction-rollup")(`reaction-rollup`.asInstanceOf[js.Any])
    __obj.updateDynamic("referenced-workflow")(`referenced-workflow`.asInstanceOf[js.Any])
    __obj.updateDynamic("referrer-traffic")(`referrer-traffic`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionsbillingusage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actionsbillingusage] (val x: Self) extends AnyVal {
    
    inline def `setActions-billing-usage`(value: Includedminutes): Self = StObject.set(x, "actions-billing-usage", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-list`(value: Actionscaches): Self = StObject.set(x, "actions-cache-list", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-usage-by-repository`(value: Activecachescount): Self = StObject.set(x, "actions-cache-usage-by-repository", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-usage-org-enterprise`(value: Totalactivecachescount): Self = StObject.set(x, "actions-cache-usage-org-enterprise", value.asInstanceOf[js.Any])
    
    inline def `setActions-can-approve-pull-request-reviews`(value: Boolean): Self = StObject.set(x, "actions-can-approve-pull-request-reviews", value.asInstanceOf[js.Any])
    
    inline def `setActions-default-workflow-permissions`(value: read | write): Self = StObject.set(x, "actions-default-workflow-permissions", value.asInstanceOf[js.Any])
    
    inline def `setActions-enabled`(value: Boolean): Self = StObject.set(x, "actions-enabled", value.asInstanceOf[js.Any])
    
    inline def `setActions-get-default-workflow-permissions`(value: Canapprovepullrequestreviews): Self = StObject.set(x, "actions-get-default-workflow-permissions", value.asInstanceOf[js.Any])
    
    inline def `setActions-organization-permissions`(value: Enabledrepositories): Self = StObject.set(x, "actions-organization-permissions", value.asInstanceOf[js.Any])
    
    inline def `setActions-public-key`(value: CreatedatId): Self = StObject.set(x, "actions-public-key", value.asInstanceOf[js.Any])
    
    inline def `setActions-repository-permissions`(value: Selectedactionsurl): Self = StObject.set(x, "actions-repository-permissions", value.asInstanceOf[js.Any])
    
    inline def `setActions-secret`(value: NameUpdatedat): Self = StObject.set(x, "actions-secret", value.asInstanceOf[js.Any])
    
    inline def `setActions-set-default-workflow-permissions`(value: Defaultworkflowpermissions): Self = StObject.set(x, "actions-set-default-workflow-permissions", value.asInstanceOf[js.Any])
    
    inline def `setActions-variable`(value: UpdatedatValue): Self = StObject.set(x, "actions-variable", value.asInstanceOf[js.Any])
    
    inline def `setActions-workflow-access-to-repository`(value: Accesslevel): Self = StObject.set(x, "actions-workflow-access-to-repository", value.asInstanceOf[js.Any])
    
    inline def setActor(value: Displaylogin): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def `setAdded-to-project-issue-event`(value: Projectcard): Self = StObject.set(x, "added-to-project-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setAlert-auto-dismissed-at`(value: String): Self = StObject.set(x, "alert-auto-dismissed-at", value.asInstanceOf[js.Any])
    
    inline def `setAlert-auto-dismissed-atNull`: Self = StObject.set(x, "alert-auto-dismissed-at", null)
    
    inline def `setAlert-created-at`(value: String): Self = StObject.set(x, "alert-created-at", value.asInstanceOf[js.Any])
    
    inline def `setAlert-dismissed-at`(value: String): Self = StObject.set(x, "alert-dismissed-at", value.asInstanceOf[js.Any])
    
    inline def `setAlert-dismissed-atNull`: Self = StObject.set(x, "alert-dismissed-at", null)
    
    inline def `setAlert-fixed-at`(value: String): Self = StObject.set(x, "alert-fixed-at", value.asInstanceOf[js.Any])
    
    inline def `setAlert-fixed-atNull`: Self = StObject.set(x, "alert-fixed-at", null)
    
    inline def `setAlert-html-url`(value: String): Self = StObject.set(x, "alert-html-url", value.asInstanceOf[js.Any])
    
    inline def `setAlert-instances-url`(value: String): Self = StObject.set(x, "alert-instances-url", value.asInstanceOf[js.Any])
    
    inline def `setAlert-number`(value: Double): Self = StObject.set(x, "alert-number", value.asInstanceOf[js.Any])
    
    inline def `setAlert-updated-at`(value: String): Self = StObject.set(x, "alert-updated-at", value.asInstanceOf[js.Any])
    
    inline def `setAlert-url`(value: String): Self = StObject.set(x, "alert-url", value.asInstanceOf[js.Any])
    
    inline def `setAllowed-actions`(value: all | local_only | selected): Self = StObject.set(x, "allowed-actions", value.asInstanceOf[js.Any])
    
    inline def `setApi-overview`(value: Api): Self = StObject.set(x, "api-overview", value.asInstanceOf[js.Any])
    
    inline def `setApp-permissions`(value: Administration): Self = StObject.set(x, "app-permissions", value.asInstanceOf[js.Any])
    
    inline def setArtifact(value: Archivedownloadurl): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def `setAssigned-issue-event`(value: ActorAssignee): Self = StObject.set(x, "assigned-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setAuthentication-token`(value: Singlefile): Self = StObject.set(x, "authentication-token", value.asInstanceOf[js.Any])
    
    inline def `setAuthor-association`(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author-association", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: App): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def `setAuto-merge`(value: Committitle): Self = StObject.set(x, "auto-merge", value.asInstanceOf[js.Any])
    
    inline def `setAuto-mergeNull`: Self = StObject.set(x, "auto-merge", null)
    
    inline def setAutolink(value: Keyprefix): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
    
    inline def `setBase-gist`(value: Commentsurl): Self = StObject.set(x, "base-gist", value.asInstanceOf[js.Any])
    
    inline def `setBasic-error`(value: DocumentationurlMessage): Self = StObject.set(x, "basic-error", value.asInstanceOf[js.Any])
    
    inline def setBlob(value: Highlightedcontent): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def `setBranch-protection`(value: Allowforcepushes): Self = StObject.set(x, "branch-protection", value.asInstanceOf[js.Any])
    
    inline def `setBranch-restriction-policy`(value: Appsurl): Self = StObject.set(x, "branch-restriction-policy", value.asInstanceOf[js.Any])
    
    inline def `setBranch-short`(value: CommitName): Self = StObject.set(x, "branch-short", value.asInstanceOf[js.Any])
    
    inline def `setBranch-with-protection`(value: Protection): Self = StObject.set(x, "branch-with-protection", value.asInstanceOf[js.Any])
    
    inline def `setCheck-annotation`(value: Blobhref): Self = StObject.set(x, "check-annotation", value.asInstanceOf[js.Any])
    
    inline def `setCheck-run`(value: Checksuite): Self = StObject.set(x, "check-run", value.asInstanceOf[js.Any])
    
    inline def `setCheck-run-with-simple-check-suite`(value: Deployment): Self = StObject.set(x, "check-run-with-simple-check-suite", value.asInstanceOf[js.Any])
    
    inline def `setCheck-suite`(value: Checkrunsurl): Self = StObject.set(x, "check-suite", value.asInstanceOf[js.Any])
    
    inline def `setCheck-suite-preference`(value: Preferences): Self = StObject.set(x, "check-suite-preference", value.asInstanceOf[js.Any])
    
    inline def `setClone-traffic`(value: Clones): Self = StObject.set(x, "clone-traffic", value.asInstanceOf[js.Any])
    
    inline def `setCode-frequency-stat`(value: js.Array[Double]): Self = StObject.set(x, "code-frequency-stat", value.asInstanceOf[js.Any])
    
    inline def `setCode-frequency-statVarargs`(value: Double*): Self = StObject.set(x, "code-frequency-stat", js.Array(value*))
    
    inline def `setCode-of-conduct`(value: BodyHtmlurl): Self = StObject.set(x, "code-of-conduct", value.asInstanceOf[js.Any])
    
    inline def `setCode-of-conduct-simple`(value: HtmlurlKey): Self = StObject.set(x, "code-of-conduct-simple", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert`(value: Fixedat): Self = StObject.set(x, "code-scanning-alert", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-classification`(value: source | generated | test | library): Self = StObject.set(x, "code-scanning-alert-classification", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-classificationNull`: Self = StObject.set(x, "code-scanning-alert-classification", null)
    
    inline def `setCode-scanning-alert-dismissed-comment`(value: String): Self = StObject.set(x, "code-scanning-alert-dismissed-comment", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-dismissed-commentNull`: Self = StObject.set(x, "code-scanning-alert-dismissed-comment", null)
    
    inline def `setCode-scanning-alert-dismissed-reason`(value: _empty | (`false positive`) | (/* won't fix */ String) | (`used in tests`)): Self = StObject.set(x, "code-scanning-alert-dismissed-reason", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-dismissed-reasonNull`: Self = StObject.set(x, "code-scanning-alert-dismissed-reason", null)
    
    inline def `setCode-scanning-alert-environment`(value: String): Self = StObject.set(x, "code-scanning-alert-environment", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-instance`(value: Analysiskey): Self = StObject.set(x, "code-scanning-alert-instance", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-items`(value: Dismissedby): Self = StObject.set(x, "code-scanning-alert-items", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-location`(value: Endcolumn): Self = StObject.set(x, "code-scanning-alert-location", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-rule`(value: Fulldescription): Self = StObject.set(x, "code-scanning-alert-rule", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-rule-summary`(value: DescriptionId): Self = StObject.set(x, "code-scanning-alert-rule-summary", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-set-state`(value: open | dismissed): Self = StObject.set(x, "code-scanning-alert-set-state", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-severity`(value: critical | high | medium | low | warning | note | error): Self = StObject.set(x, "code-scanning-alert-severity", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-alert-state`(value: open | closed | dismissed | fixed): Self = StObject.set(x, "code-scanning-alert-state", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis`(value: Deletable): Self = StObject.set(x, "code-scanning-analysis", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-analysis-key`(value: String): Self = StObject.set(x, "code-scanning-analysis-analysis-key", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-category`(value: String): Self = StObject.set(x, "code-scanning-analysis-category", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-commit-sha`(value: String): Self = StObject.set(x, "code-scanning-analysis-commit-sha", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-created-at`(value: String): Self = StObject.set(x, "code-scanning-analysis-created-at", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-deletion`(value: Confirmdeleteurl): Self = StObject.set(x, "code-scanning-analysis-deletion", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-environment`(value: String): Self = StObject.set(x, "code-scanning-analysis-environment", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-sarif-file`(value: String): Self = StObject.set(x, "code-scanning-analysis-sarif-file", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-sarif-id`(value: String): Self = StObject.set(x, "code-scanning-analysis-sarif-id", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-tool`(value: Guid): Self = StObject.set(x, "code-scanning-analysis-tool", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-tool-guid`(value: String): Self = StObject.set(x, "code-scanning-analysis-tool-guid", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-tool-guidNull`: Self = StObject.set(x, "code-scanning-analysis-tool-guid", null)
    
    inline def `setCode-scanning-analysis-tool-name`(value: String): Self = StObject.set(x, "code-scanning-analysis-tool-name", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-tool-version`(value: String): Self = StObject.set(x, "code-scanning-analysis-tool-version", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-analysis-tool-versionNull`: Self = StObject.set(x, "code-scanning-analysis-tool-version", null)
    
    inline def `setCode-scanning-analysis-url`(value: String): Self = StObject.set(x, "code-scanning-analysis-url", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-codeql-database`(value: Uploader): Self = StObject.set(x, "code-scanning-codeql-database", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-default-setup`(value: Languages): Self = StObject.set(x, "code-scanning-default-setup", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-default-setup-update`(value: Querysuite): Self = StObject.set(x, "code-scanning-default-setup-update", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-default-setup-update-response`(value: Runurl): Self = StObject.set(x, "code-scanning-default-setup-update-response", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-organization-alert-items`(value: Dismissedat): Self = StObject.set(x, "code-scanning-organization-alert-items", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-ref`(value: String): Self = StObject.set(x, "code-scanning-ref", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-sarifs-receipt`(value: IdUrl): Self = StObject.set(x, "code-scanning-sarifs-receipt", value.asInstanceOf[js.Any])
    
    inline def `setCode-scanning-sarifs-status`(value: Analysesurl): Self = StObject.set(x, "code-scanning-sarifs-status", value.asInstanceOf[js.Any])
    
    inline def `setCode-search-result-item`(value: Filesize): Self = StObject.set(x, "code-search-result-item", value.asInstanceOf[js.Any])
    
    inline def `setCodeowners-errors`(value: ErrorsArray): Self = StObject.set(x, "codeowners-errors", value.asInstanceOf[js.Any])
    
    inline def setCodespace(value: Environmentid): Self = StObject.set(x, "codespace", value.asInstanceOf[js.Any])
    
    inline def `setCodespace-export-details`(value: Exporturl): Self = StObject.set(x, "codespace-export-details", value.asInstanceOf[js.Any])
    
    inline def `setCodespace-machine`(value: Cpus): Self = StObject.set(x, "codespace-machine", value.asInstanceOf[js.Any])
    
    inline def `setCodespace-with-full-repository`(value: Gitstatus): Self = StObject.set(x, "codespace-with-full-repository", value.asInstanceOf[js.Any])
    
    inline def `setCodespaces-org-secret`(value: CreatedatName): Self = StObject.set(x, "codespaces-org-secret", value.asInstanceOf[js.Any])
    
    inline def `setCodespaces-public-key`(value: CreatedatId): Self = StObject.set(x, "codespaces-public-key", value.asInstanceOf[js.Any])
    
    inline def `setCodespaces-secret`(value: SelectedrepositoriesurlUpdatedat): Self = StObject.set(x, "codespaces-secret", value.asInstanceOf[js.Any])
    
    inline def `setCodespaces-user-public-key`(value: KeyKeyid): Self = StObject.set(x, "codespaces-user-public-key", value.asInstanceOf[js.Any])
    
    inline def setCollaborator(value: Followingurl): Self = StObject.set(x, "collaborator", value.asInstanceOf[js.Any])
    
    inline def `setCombined-billing-usage`(value: Daysleftinbillingcycle): Self = StObject.set(x, "combined-billing-usage", value.asInstanceOf[js.Any])
    
    inline def `setCombined-commit-status`(value: Commiturl): Self = StObject.set(x, "combined-commit-status", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: Stats): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def `setCommit-activity`(value: Days): Self = StObject.set(x, "commit-activity", value.asInstanceOf[js.Any])
    
    inline def `setCommit-comment`(value: Reactions): Self = StObject.set(x, "commit-comment", value.asInstanceOf[js.Any])
    
    inline def `setCommit-comparison`(value: Aheadby): Self = StObject.set(x, "commit-comparison", value.asInstanceOf[js.Any])
    
    inline def `setCommit-search-result-item`(value: Textmatches): Self = StObject.set(x, "commit-search-result-item", value.asInstanceOf[js.Any])
    
    inline def `setCommunity-profile`(value: Contentreportsenabled): Self = StObject.set(x, "community-profile", value.asInstanceOf[js.Any])
    
    inline def `setContent-directory`(value: js.Array[Giturl]): Self = StObject.set(x, "content-directory", value.asInstanceOf[js.Any])
    
    inline def `setContent-directoryVarargs`(value: Giturl*): Self = StObject.set(x, "content-directory", js.Array(value*))
    
    inline def `setContent-file`(value: Submodulegiturl): Self = StObject.set(x, "content-file", value.asInstanceOf[js.Any])
    
    inline def `setContent-submodule`(value: DownloadurlGiturl): Self = StObject.set(x, "content-submodule", value.asInstanceOf[js.Any])
    
    inline def `setContent-symlink`(value: Target): Self = StObject.set(x, "content-symlink", value.asInstanceOf[js.Any])
    
    inline def `setContent-traffic`(value: Uniques): Self = StObject.set(x, "content-traffic", value.asInstanceOf[js.Any])
    
    inline def `setContent-tree`(value: Entries): Self = StObject.set(x, "content-tree", value.asInstanceOf[js.Any])
    
    inline def setContributor(value: Contributions): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
    
    inline def `setContributor-activity`(value: Total): Self = StObject.set(x, "contributor-activity", value.asInstanceOf[js.Any])
    
    inline def `setConverted-note-to-issue-issue-event`(value: CreatedatEvent): Self = StObject.set(x, "converted-note-to-issue-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setCustom-deployment-rule-app`(value: Integrationurl): Self = StObject.set(x, "custom-deployment-rule-app", value.asInstanceOf[js.Any])
    
    inline def `setDemilestoned-issue-event`(value: CommitidCommiturl): Self = StObject.set(x, "demilestoned-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert`(value: Dependency): Self = StObject.set(x, "dependabot-alert", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-package`(value: EcosystemName): Self = StObject.set(x, "dependabot-alert-package", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-security-advisory`(value: Cveid): Self = StObject.set(x, "dependabot-alert-security-advisory", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-security-vulnerability`(value: Firstpatchedversion): Self = StObject.set(x, "dependabot-alert-security-vulnerability", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-with-repository`(value: Autodismissedat): Self = StObject.set(x, "dependabot-alert-with-repository", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-public-key`(value: KeyKeyid): Self = StObject.set(x, "dependabot-public-key", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-secret`(value: NameUpdatedat): Self = StObject.set(x, "dependabot-secret", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: Dependencies): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def `setDependency-graph-diff`(value: js.Array[Changetype]): Self = StObject.set(x, "dependency-graph-diff", value.asInstanceOf[js.Any])
    
    inline def `setDependency-graph-diffVarargs`(value: Changetype*): Self = StObject.set(x, "dependency-graph-diff", js.Array(value*))
    
    inline def `setDependency-graph-spdx-sbom`(value: Sbom): Self = StObject.set(x, "dependency-graph-spdx-sbom", value.asInstanceOf[js.Any])
    
    inline def `setDeploy-key`(value: Addedby): Self = StObject.set(x, "deploy-key", value.asInstanceOf[js.Any])
    
    inline def setDeployment(value: Originalenvironment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-branch-policy`(value: NameNodeid): Self = StObject.set(x, "deployment-branch-policy", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-branch-policy-name-pattern`(value: Name): Self = StObject.set(x, "deployment-branch-policy-name-pattern", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-branch-policy-settings`(value: Custombranchpolicies): Self = StObject.set(x, "deployment-branch-policy-settings", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-branch-policy-settingsNull`: Self = StObject.set(x, "deployment-branch-policy-settings", null)
    
    inline def `setDeployment-protection-rule`(value: AppEnabled): Self = StObject.set(x, "deployment-protection-rule", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-reviewer-type`(
      value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team
    ): Self = StObject.set(x, "deployment-reviewer-type", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-simple`(value: Performedviagithubapp): Self = StObject.set(x, "deployment-simple", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-status`(value: Deploymenturl): Self = StObject.set(x, "deployment-status", value.asInstanceOf[js.Any])
    
    inline def `setDiff-entry`(value: Bloburl): Self = StObject.set(x, "diff-entry", value.asInstanceOf[js.Any])
    
    inline def setDiscussion(value: Answerchosenat): Self = StObject.set(x, "discussion", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: Primary): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def `setEmpty-object`(value: Record[String, scala.Nothing]): Self = StObject.set(x, "empty-object", value.asInstanceOf[js.Any])
    
    inline def `setEnabled-repositories`(value: all | none_ | selected): Self = StObject.set(x, "enabled-repositories", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: Protectionrules): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def `setEnvironment-approvals`(value: CommentEnvironments): Self = StObject.set(x, "environment-approvals", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Public): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFeed(value: Currentuseractorurl): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    inline def `setFile-commit`(value: CommitContent): Self = StObject.set(x, "file-commit", value.asInstanceOf[js.Any])
    
    inline def `setFull-repository`(value: Anonymousaccessenabled): Self = StObject.set(x, "full-repository", value.asInstanceOf[js.Any])
    
    inline def `setGist-comment`(value: User): Self = StObject.set(x, "gist-comment", value.asInstanceOf[js.Any])
    
    inline def `setGist-commit`(value: Version): Self = StObject.set(x, "gist-commit", value.asInstanceOf[js.Any])
    
    inline def `setGist-history`(value: Changestatus): Self = StObject.set(x, "gist-history", value.asInstanceOf[js.Any])
    
    inline def `setGist-simple`(value: Forkof): Self = StObject.set(x, "gist-simple", value.asInstanceOf[js.Any])
    
    inline def `setGit-commit`(value: AuthorCommitter): Self = StObject.set(x, "git-commit", value.asInstanceOf[js.Any])
    
    inline def `setGit-ref`(value: NodeidObject): Self = StObject.set(x, "git-ref", value.asInstanceOf[js.Any])
    
    inline def `setGit-tag`(value: Tagger): Self = StObject.set(x, "git-tag", value.asInstanceOf[js.Any])
    
    inline def `setGit-tree`(value: Truncated): Self = StObject.set(x, "git-tree", value.asInstanceOf[js.Any])
    
    inline def `setGitignore-template`(value: NameSource): Self = StObject.set(x, "gitignore-template", value.asInstanceOf[js.Any])
    
    inline def `setGpg-key`(value: Canencryptcomms): Self = StObject.set(x, "gpg-key", value.asInstanceOf[js.Any])
    
    inline def setHook(value: Lastresponse): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def `setHook-delivery`(value: Duration): Self = StObject.set(x, "hook-delivery", value.asInstanceOf[js.Any])
    
    inline def `setHook-delivery-item`(value: Deliveredat): Self = StObject.set(x, "hook-delivery-item", value.asInstanceOf[js.Any])
    
    inline def `setHook-response`(value: MessageStatus): Self = StObject.set(x, "hook-response", value.asInstanceOf[js.Any])
    
    inline def setHovercard(value: `523`): Self = StObject.set(x, "hovercard", value.asInstanceOf[js.Any])
    
    inline def setImport(value: Authorscount): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: Accesstokensurl): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def `setInstallation-token`(value: Expiresat): Self = StObject.set(x, "installation-token", value.asInstanceOf[js.Any])
    
    inline def setIntegration(value: Clientsecret): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    inline def `setIntegration-installation-request`(value: Account): Self = StObject.set(x, "integration-installation-request", value.asInstanceOf[js.Any])
    
    inline def `setInteraction-expiry`(value: one_day | three_days | one_week | one_month | six_months): Self = StObject.set(x, "interaction-expiry", value.asInstanceOf[js.Any])
    
    inline def `setInteraction-group`(value: existing_users | contributors_only | collaborators_only): Self = StObject.set(x, "interaction-group", value.asInstanceOf[js.Any])
    
    inline def `setInteraction-limit`(value: Expiry): Self = StObject.set(x, "interaction-limit", value.asInstanceOf[js.Any])
    
    inline def `setInteraction-limit-response`(value: Limit): Self = StObject.set(x, "interaction-limit-response", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: Activelockreason): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def `setIssue-comment`(value: Authorassociation): Self = StObject.set(x, "issue-comment", value.asInstanceOf[js.Any])
    
    inline def `setIssue-event`(value: Assigner): Self = StObject.set(x, "issue-event", value.asInstanceOf[js.Any])
    
    inline def `setIssue-event-dismissed-review`(value: Dismissalcommitid): Self = StObject.set(x, "issue-event-dismissed-review", value.asInstanceOf[js.Any])
    
    inline def `setIssue-event-for-issue`(
      value: EventId_ | AssignerCommitid | NodeidPerformedviagithubapp | IdMilestone | PerformedviagithubappRename | Requestedteam | CreatedatDismissedreview | IdLockreason | PerformedviagithubappProjectcard | ProjectcardUrl
    ): Self = StObject.set(x, "issue-event-for-issue", value.asInstanceOf[js.Any])
    
    inline def `setIssue-event-label`(value: ColorName): Self = StObject.set(x, "issue-event-label", value.asInstanceOf[js.Any])
    
    inline def `setIssue-event-milestone`(value: TitleString): Self = StObject.set(x, "issue-event-milestone", value.asInstanceOf[js.Any])
    
    inline def `setIssue-event-project-card`(value: Previouscolumnname): Self = StObject.set(x, "issue-event-project-card", value.asInstanceOf[js.Any])
    
    inline def `setIssue-event-rename`(value: From): Self = StObject.set(x, "issue-event-rename", value.asInstanceOf[js.Any])
    
    inline def `setIssue-search-result-item`(value: Labelsurl): Self = StObject.set(x, "issue-search-result-item", value.asInstanceOf[js.Any])
    
    inline def setJob(value: Checkrunurl): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setKey(value: IdKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def `setKey-simple`(value: KeyString): Self = StObject.set(x, "key-simple", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: DefaultDescription): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def `setLabel-search-result-item`(value: NodeidScore): Self = StObject.set(x, "label-search-result-item", value.asInstanceOf[js.Any])
    
    inline def `setLabeled-issue-event`(value: ActorCommitid): Self = StObject.set(x, "labeled-issue-event", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: StringDictionary[js.UndefOr[Double]]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: Implementation): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def `setLicense-content`(value: ContentDownloadurl): Self = StObject.set(x, "license-content", value.asInstanceOf[js.Any])
    
    inline def `setLicense-simple`(value: Nodeid): Self = StObject.set(x, "license-simple", value.asInstanceOf[js.Any])
    
    inline def setLink(value: HrefString): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def `setLink-with-type`(value: Href): Self = StObject.set(x, "link-with-type", value.asInstanceOf[js.Any])
    
    inline def `setLocked-issue-event`(value: CommiturlCreatedat): Self = StObject.set(x, "locked-issue-event", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: File): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def `setMarketplace-account`(value: Organizationbillingemail): Self = StObject.set(x, "marketplace-account", value.asInstanceOf[js.Any])
    
    inline def `setMarketplace-listing-plan`(value: Accountsurl): Self = StObject.set(x, "marketplace-listing-plan", value.asInstanceOf[js.Any])
    
    inline def `setMarketplace-purchase`(value: Login): Self = StObject.set(x, "marketplace-purchase", value.asInstanceOf[js.Any])
    
    inline def `setMerge-group`(value: Baseref): Self = StObject.set(x, "merge-group", value.asInstanceOf[js.Any])
    
    inline def `setMerged-upstream`(value: Basebranch): Self = StObject.set(x, "merged-upstream", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[js.UndefOr[String | Double | Boolean | Null]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMigration(value: Excludemetadata): Self = StObject.set(x, "migration", value.asInstanceOf[js.Any])
    
    inline def setMilestone(value: Closedat): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def `setMilestoned-issue-event`(value: CommitidCommiturl): Self = StObject.set(x, "milestoned-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setMinimal-repository`(value: Blobsurl): Self = StObject.set(x, "minimal-repository", value.asInstanceOf[js.Any])
    
    inline def `setMoved-column-in-project-issue-event`(value: Projectcard): Self = StObject.set(x, "moved-column-in-project-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setNullable-alert-updated-at`(value: String): Self = StObject.set(x, "nullable-alert-updated-at", value.asInstanceOf[js.Any])
    
    inline def `setNullable-alert-updated-atNull`: Self = StObject.set(x, "nullable-alert-updated-at", null)
    
    inline def `setNullable-code-of-conduct-simple`(value: HtmlurlKey): Self = StObject.set(x, "nullable-code-of-conduct-simple", value.asInstanceOf[js.Any])
    
    inline def `setNullable-code-of-conduct-simpleNull`: Self = StObject.set(x, "nullable-code-of-conduct-simple", null)
    
    inline def `setNullable-codespace-machine`(value: Cpus): Self = StObject.set(x, "nullable-codespace-machine", value.asInstanceOf[js.Any])
    
    inline def `setNullable-codespace-machineNull`: Self = StObject.set(x, "nullable-codespace-machine", null)
    
    inline def `setNullable-collaborator`(value: Followingurl): Self = StObject.set(x, "nullable-collaborator", value.asInstanceOf[js.Any])
    
    inline def `setNullable-collaboratorNull`: Self = StObject.set(x, "nullable-collaborator", null)
    
    inline def `setNullable-community-health-file`(value: HtmlurlUrl): Self = StObject.set(x, "nullable-community-health-file", value.asInstanceOf[js.Any])
    
    inline def `setNullable-community-health-fileNull`: Self = StObject.set(x, "nullable-community-health-file", null)
    
    inline def `setNullable-git-user`(value: DateEmail): Self = StObject.set(x, "nullable-git-user", value.asInstanceOf[js.Any])
    
    inline def `setNullable-git-userNull`: Self = StObject.set(x, "nullable-git-user", null)
    
    inline def `setNullable-integration`(value: Clientsecret): Self = StObject.set(x, "nullable-integration", value.asInstanceOf[js.Any])
    
    inline def `setNullable-integrationNull`: Self = StObject.set(x, "nullable-integration", null)
    
    inline def `setNullable-issue`(value: Activelockreason): Self = StObject.set(x, "nullable-issue", value.asInstanceOf[js.Any])
    
    inline def `setNullable-issueNull`: Self = StObject.set(x, "nullable-issue", null)
    
    inline def `setNullable-license-simple`(value: Nodeid): Self = StObject.set(x, "nullable-license-simple", value.asInstanceOf[js.Any])
    
    inline def `setNullable-license-simpleNull`: Self = StObject.set(x, "nullable-license-simple", null)
    
    inline def `setNullable-milestone`(value: Closedat): Self = StObject.set(x, "nullable-milestone", value.asInstanceOf[js.Any])
    
    inline def `setNullable-milestoneNull`: Self = StObject.set(x, "nullable-milestone", null)
    
    inline def `setNullable-minimal-repository`(value: Blobsurl): Self = StObject.set(x, "nullable-minimal-repository", value.asInstanceOf[js.Any])
    
    inline def `setNullable-minimal-repositoryNull`: Self = StObject.set(x, "nullable-minimal-repository", null)
    
    inline def `setNullable-repository`(value: Allowsquashmerge): Self = StObject.set(x, "nullable-repository", value.asInstanceOf[js.Any])
    
    inline def `setNullable-repositoryNull`: Self = StObject.set(x, "nullable-repository", null)
    
    inline def `setNullable-scoped-installation`(value: Hasmultiplesinglefiles): Self = StObject.set(x, "nullable-scoped-installation", value.asInstanceOf[js.Any])
    
    inline def `setNullable-scoped-installationNull`: Self = StObject.set(x, "nullable-scoped-installation", null)
    
    inline def `setNullable-simple-commit`(value: Timestamp): Self = StObject.set(x, "nullable-simple-commit", value.asInstanceOf[js.Any])
    
    inline def `setNullable-simple-commitNull`: Self = StObject.set(x, "nullable-simple-commit", null)
    
    inline def `setNullable-simple-user`(value: Avatarurl): Self = StObject.set(x, "nullable-simple-user", value.asInstanceOf[js.Any])
    
    inline def `setNullable-simple-userNull`: Self = StObject.set(x, "nullable-simple-user", null)
    
    inline def `setNullable-team-simple`(value: Ldapdn): Self = StObject.set(x, "nullable-team-simple", value.asInstanceOf[js.Any])
    
    inline def `setNullable-team-simpleNull`: Self = StObject.set(x, "nullable-team-simple", null)
    
    inline def `setOidc-custom-sub`(value: IncludeclaimkeysArray): Self = StObject.set(x, "oidc-custom-sub", value.asInstanceOf[js.Any])
    
    inline def `setOidc-custom-sub-repo`(value: Includeclaimkeys): Self = StObject.set(x, "oidc-custom-sub-repo", value.asInstanceOf[js.Any])
    
    inline def `setOrg-hook`(value: Deliveriesurl): Self = StObject.set(x, "org-hook", value.asInstanceOf[js.Any])
    
    inline def `setOrg-membership`(value: Organizationurl): Self = StObject.set(x, "org-membership", value.asInstanceOf[js.Any])
    
    inline def `setOrg-ruleset-conditions`(value: Refname & Repositoryname): Self = StObject.set(x, "org-ruleset-conditions", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-actions-secret`(value: CreatedatName): Self = StObject.set(x, "organization-actions-secret", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-actions-variable`(value: NameSelectedrepositoriesurl): Self = StObject.set(x, "organization-actions-variable", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-dependabot-secret`(value: CreatedatName): Self = StObject.set(x, "organization-dependabot-secret", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-full`(value: Billingemail): Self = StObject.set(x, "organization-full", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-invitation`(value: Failedat): Self = StObject.set(x, "organization-invitation", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-programmatic-access-grant`(value: Accessgrantedat): Self = StObject.set(x, "organization-programmatic-access-grant", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-programmatic-access-grant-request`(value: Tokenexpired): Self = StObject.set(x, "organization-programmatic-access-grant-request", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-secret-scanning-alert`(value: Locationsurl): Self = StObject.set(x, "organization-secret-scanning-alert", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-simple`(value: Hooksurl): Self = StObject.set(x, "organization-simple", value.asInstanceOf[js.Any])
    
    inline def `setPackage-version`(value: Deletedat): Self = StObject.set(x, "package-version", value.asInstanceOf[js.Any])
    
    inline def `setPackages-billing-usage`(value: Includedgigabytesbandwidth): Self = StObject.set(x, "packages-billing-usage", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Cname): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def `setPage-build`(value: Error): Self = StObject.set(x, "page-build", value.asInstanceOf[js.Any])
    
    inline def `setPage-build-status`(value: StatusUrl): Self = StObject.set(x, "page-build-status", value.asInstanceOf[js.Any])
    
    inline def `setPage-deployment`(value: Pageurl): Self = StObject.set(x, "page-deployment", value.asInstanceOf[js.Any])
    
    inline def `setPages-health-check`(value: Altdomain): Self = StObject.set(x, "pages-health-check", value.asInstanceOf[js.Any])
    
    inline def `setPages-https-certificate`(value: Domains): Self = StObject.set(x, "pages-https-certificate", value.asInstanceOf[js.Any])
    
    inline def `setPages-source-hash`(value: PathString): Self = StObject.set(x, "pages-source-hash", value.asInstanceOf[js.Any])
    
    inline def `setParticipation-stats`(value: AllOwner): Self = StObject.set(x, "participation-stats", value.asInstanceOf[js.Any])
    
    inline def `setPending-deployment`(value: Currentusercanapprove): Self = StObject.set(x, "pending-deployment", value.asInstanceOf[js.Any])
    
    inline def `setPersonal-access-token-request`(value: Permissionsadded): Self = StObject.set(x, "personal-access-token-request", value.asInstanceOf[js.Any])
    
    inline def `setPorter-author`(value: Importurl): Self = StObject.set(x, "porter-author", value.asInstanceOf[js.Any])
    
    inline def `setPorter-large-file`(value: Oid): Self = StObject.set(x, "porter-large-file", value.asInstanceOf[js.Any])
    
    inline def `setPrivate-user`(value: Businessplus): Self = StObject.set(x, "private-user", value.asInstanceOf[js.Any])
    
    inline def `setPrivate-vulnerability-report-create`(value: Cweids): Self = StObject.set(x, "private-vulnerability-report-create", value.asInstanceOf[js.Any])
    
    inline def setProject(value: Columnsurl): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def `setProject-card`(value: Columnname): Self = StObject.set(x, "project-card", value.asInstanceOf[js.Any])
    
    inline def `setProject-collaborator-permission`(value: PermissionUser): Self = StObject.set(x, "project-collaborator-permission", value.asInstanceOf[js.Any])
    
    inline def `setProject-column`(value: Cardsurl): Self = StObject.set(x, "project-column", value.asInstanceOf[js.Any])
    
    inline def `setProjects-v2`(value: Deletedby): Self = StObject.set(x, "projects-v2", value.asInstanceOf[js.Any])
    
    inline def `setProjects-v2-item`(value: Archivedat): Self = StObject.set(x, "projects-v2-item", value.asInstanceOf[js.Any])
    
    inline def `setProjects-v2-item-content-type`(value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Issue | PullRequest | DraftIssue): Self = StObject.set(x, "projects-v2-item-content-type", value.asInstanceOf[js.Any])
    
    inline def `setProtected-branch`(value: Blockcreations): Self = StObject.set(x, "protected-branch", value.asInstanceOf[js.Any])
    
    inline def `setProtected-branch-admin-enforced`(value: EnabledUrl): Self = StObject.set(x, "protected-branch-admin-enforced", value.asInstanceOf[js.Any])
    
    inline def `setProtected-branch-pull-request-review`(value: Dismissalrestrictions): Self = StObject.set(x, "protected-branch-pull-request-review", value.asInstanceOf[js.Any])
    
    inline def `setProtected-branch-required-status-check`(value: Contextsurl): Self = StObject.set(x, "protected-branch-required-status-check", value.asInstanceOf[js.Any])
    
    inline def `setPublic-user`(value: Blog): Self = StObject.set(x, "public-user", value.asInstanceOf[js.Any])
    
    inline def `setPull-request`(value: Changedfiles): Self = StObject.set(x, "pull-request", value.asInstanceOf[js.Any])
    
    inline def `setPull-request-merge-result`(value: Merged): Self = StObject.set(x, "pull-request-merge-result", value.asInstanceOf[js.Any])
    
    inline def `setPull-request-minimal`(value: HeadId): Self = StObject.set(x, "pull-request-minimal", value.asInstanceOf[js.Any])
    
    inline def `setPull-request-review`(value: BodyhtmlBodytext): Self = StObject.set(x, "pull-request-review", value.asInstanceOf[js.Any])
    
    inline def `setPull-request-review-comment`(value: Diffhunk): Self = StObject.set(x, "pull-request-review-comment", value.asInstanceOf[js.Any])
    
    inline def `setPull-request-review-request`(value: UsersArray): Self = StObject.set(x, "pull-request-review-request", value.asInstanceOf[js.Any])
    
    inline def `setPull-request-simple`(value: Issueurl): Self = StObject.set(x, "pull-request-simple", value.asInstanceOf[js.Any])
    
    inline def `setRate-limit`(value: Remaining): Self = StObject.set(x, "rate-limit", value.asInstanceOf[js.Any])
    
    inline def `setRate-limit-overview`(value: Rate): Self = StObject.set(x, "rate-limit-overview", value.asInstanceOf[js.Any])
    
    inline def setReaction(value: ContentCreatedat): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def `setReaction-rollup`(value: Confused): Self = StObject.set(x, "reaction-rollup", value.asInstanceOf[js.Any])
    
    inline def `setReferenced-workflow`(value: PathRef): Self = StObject.set(x, "referenced-workflow", value.asInstanceOf[js.Any])
    
    inline def `setReferrer-traffic`(value: Referrer): Self = StObject.set(x, "referrer-traffic", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Assets): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def `setRelease-asset`(value: Browserdownloadurl): Self = StObject.set(x, "release-asset", value.asInstanceOf[js.Any])
    
    inline def `setRelease-notes-content`(value: BodyString): Self = StObject.set(x, "release-notes-content", value.asInstanceOf[js.Any])
    
    inline def `setRemoved-from-project-issue-event`(value: Projectcard): Self = StObject.set(x, "removed-from-project-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setRenamed-issue-event`(value: Rename): Self = StObject.set(x, "renamed-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setRepo-codespaces-secret`(value: NameUpdatedat): Self = StObject.set(x, "repo-codespaces-secret", value.asInstanceOf[js.Any])
    
    inline def `setRepo-required-workflow`(value: Badgeurl): Self = StObject.set(x, "repo-required-workflow", value.asInstanceOf[js.Any])
    
    inline def `setRepo-search-result-item`(value: Contentsurl): Self = StObject.set(x, "repo-search-result-item", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowsquashmerge): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def `setRepository-advisory`(value: Credits): Self = StObject.set(x, "repository-advisory", value.asInstanceOf[js.Any])
    
    inline def `setRepository-advisory-create`(value: Cvssvectorstring): Self = StObject.set(x, "repository-advisory-create", value.asInstanceOf[js.Any])
    
    inline def `setRepository-advisory-credit`(value: StateType): Self = StObject.set(x, "repository-advisory-credit", value.asInstanceOf[js.Any])
    
    inline def `setRepository-advisory-update`(value: Summary): Self = StObject.set(x, "repository-advisory-update", value.asInstanceOf[js.Any])
    
    inline def `setRepository-advisory-vulnerability`(value: Patchedversions): Self = StObject.set(x, "repository-advisory-vulnerability", value.asInstanceOf[js.Any])
    
    inline def `setRepository-collaborator-permission`(value: Rolename): Self = StObject.set(x, "repository-collaborator-permission", value.asInstanceOf[js.Any])
    
    inline def `setRepository-invitation`(value: Expired): Self = StObject.set(x, "repository-invitation", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule`(
      value: `499` | ParametersType | `501` | `502` | `504` | `505` | `506` | `514` | `508` | `509` | `510` | `511` | `512` | `513`
    ): Self = StObject.set(x, "repository-rule", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-branch-name-pattern`(value: `512`): Self = StObject.set(x, "repository-rule-branch-name-pattern", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-commit-author-email-pattern`(value: `510`): Self = StObject.set(x, "repository-rule-commit-author-email-pattern", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-commit-message-pattern`(value: `509`): Self = StObject.set(x, "repository-rule-commit-message-pattern", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-committer-email-pattern`(value: `511`): Self = StObject.set(x, "repository-rule-committer-email-pattern", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-creation`(value: `499`): Self = StObject.set(x, "repository-rule-creation", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-deletion`(value: `501`): Self = StObject.set(x, "repository-rule-deletion", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-enforcement`(value: disabled | active | evaluate): Self = StObject.set(x, "repository-rule-enforcement", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-non-fast-forward`(value: `508`): Self = StObject.set(x, "repository-rule-non-fast-forward", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-params-status-check-configuration`(value: ContextIntegrationid): Self = StObject.set(x, "repository-rule-params-status-check-configuration", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-pull-request`(value: `506`): Self = StObject.set(x, "repository-rule-pull-request", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-required-deployments`(value: `504`): Self = StObject.set(x, "repository-rule-required-deployments", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-required-linear-history`(value: `502`): Self = StObject.set(x, "repository-rule-required-linear-history", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-required-signatures`(value: `505`): Self = StObject.set(x, "repository-rule-required-signatures", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-required-status-checks`(value: `507`): Self = StObject.set(x, "repository-rule-required-status-checks", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-tag-name-pattern`(value: `513`): Self = StObject.set(x, "repository-rule-tag-name-pattern", value.asInstanceOf[js.Any])
    
    inline def `setRepository-rule-update`(value: ParametersType): Self = StObject.set(x, "repository-rule-update", value.asInstanceOf[js.Any])
    
    inline def `setRepository-ruleset`(value: Links): Self = StObject.set(x, "repository-ruleset", value.asInstanceOf[js.Any])
    
    inline def `setRepository-ruleset-bypass-actor`(value: Actorid): Self = StObject.set(x, "repository-ruleset-bypass-actor", value.asInstanceOf[js.Any])
    
    inline def `setRepository-ruleset-conditions`(value: Refname): Self = StObject.set(x, "repository-ruleset-conditions", value.asInstanceOf[js.Any])
    
    inline def `setRepository-ruleset-conditions-repository-name-target`(value: Repositoryname): Self = StObject.set(x, "repository-ruleset-conditions-repository-name-target", value.asInstanceOf[js.Any])
    
    inline def `setRepository-subscription`(value: CreatedatIgnored): Self = StObject.set(x, "repository-subscription", value.asInstanceOf[js.Any])
    
    inline def `setRequired-workflow`(value: Selectedrepositoriesurl): Self = StObject.set(x, "required-workflow", value.asInstanceOf[js.Any])
    
    inline def `setReview-comment`(value: Originalcommitid): Self = StObject.set(x, "review-comment", value.asInstanceOf[js.Any])
    
    inline def `setReview-custom-gates-comment-required`(value: CommentEnvironmentname): Self = StObject.set(x, "review-custom-gates-comment-required", value.asInstanceOf[js.Any])
    
    inline def `setReview-custom-gates-state-required`(value: EnvironmentnameState): Self = StObject.set(x, "review-custom-gates-state-required", value.asInstanceOf[js.Any])
    
    inline def `setReview-dismissed-issue-event`(value: Dismissedreview): Self = StObject.set(x, "review-dismissed-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setReview-request-removed-issue-event`(value: Requestedreviewer): Self = StObject.set(x, "review-request-removed-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setReview-requested-issue-event`(value: Requestedreviewer): Self = StObject.set(x, "review-requested-issue-event", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Authorizationsurl): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRunner(value: Busy): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    
    inline def `setRunner-application`(value: Architecture): Self = StObject.set(x, "runner-application", value.asInstanceOf[js.Any])
    
    inline def `setRunner-label`(value: NameType): Self = StObject.set(x, "runner-label", value.asInstanceOf[js.Any])
    
    inline def `setScim-error`(value: Detail): Self = StObject.set(x, "scim-error", value.asInstanceOf[js.Any])
    
    inline def `setSearch-result-text-matches`(value: js.Array[Fragment]): Self = StObject.set(x, "search-result-text-matches", value.asInstanceOf[js.Any])
    
    inline def `setSearch-result-text-matchesVarargs`(value: Fragment*): Self = StObject.set(x, "search-result-text-matches", js.Array(value*))
    
    inline def `setSecret-scanning-alert`(value: Pushprotectionbypassed): Self = StObject.set(x, "secret-scanning-alert", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-resolution`(value: false_positive | wont_fix | revoked | used_in_tests): Self = StObject.set(x, "secret-scanning-alert-resolution", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-resolution-comment`(value: String): Self = StObject.set(x, "secret-scanning-alert-resolution-comment", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-resolution-commentNull`: Self = StObject.set(x, "secret-scanning-alert-resolution-comment", null)
    
    inline def `setSecret-scanning-alert-resolutionNull`: Self = StObject.set(x, "secret-scanning-alert-resolution", null)
    
    inline def `setSecret-scanning-alert-state`(value: open | resolved): Self = StObject.set(x, "secret-scanning-alert-state", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-location`(value: Details): Self = StObject.set(x, "secret-scanning-location", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-location-commit`(value: Blobsha): Self = StObject.set(x, "secret-scanning-location-commit", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-location-issue-body`(value: Issuebodyurl): Self = StObject.set(x, "secret-scanning-location-issue-body", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-location-issue-comment`(value: Issuecommenturl): Self = StObject.set(x, "secret-scanning-location-issue-comment", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-location-issue-title`(value: Issuetitleurl): Self = StObject.set(x, "secret-scanning-location-issue-title", value.asInstanceOf[js.Any])
    
    inline def `setSecurity-advisory-credit-types`(
      value: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
    ): Self = StObject.set(x, "security-advisory-credit-types", value.asInstanceOf[js.Any])
    
    inline def `setSecurity-advisory-ecosystems`(
      value: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
    ): Self = StObject.set(x, "security-advisory-ecosystems", value.asInstanceOf[js.Any])
    
    inline def `setSecurity-and-analysis`(value: Secretscanning): Self = StObject.set(x, "security-and-analysis", value.asInstanceOf[js.Any])
    
    inline def `setSecurity-and-analysisNull`: Self = StObject.set(x, "security-and-analysis", null)
    
    inline def `setSelected-actions`(value: Githubownedallowed): Self = StObject.set(x, "selected-actions", value.asInstanceOf[js.Any])
    
    inline def `setSelected-actions-url`(value: String): Self = StObject.set(x, "selected-actions-url", value.asInstanceOf[js.Any])
    
    inline def `setShort-blob`(value: ShaString): Self = StObject.set(x, "short-blob", value.asInstanceOf[js.Any])
    
    inline def `setShort-branch`(value: Commit): Self = StObject.set(x, "short-branch", value.asInstanceOf[js.Any])
    
    inline def `setSimple-check-suite`(value: Conclusion): Self = StObject.set(x, "simple-check-suite", value.asInstanceOf[js.Any])
    
    inline def `setSimple-commit`(value: Timestamp): Self = StObject.set(x, "simple-commit", value.asInstanceOf[js.Any])
    
    inline def `setSimple-commit-status`(value: Required): Self = StObject.set(x, "simple-commit-status", value.asInstanceOf[js.Any])
    
    inline def `setSimple-installation`(value: NodeidString): Self = StObject.set(x, "simple-installation", value.asInstanceOf[js.Any])
    
    inline def `setSimple-repository`(value: Archiveurl): Self = StObject.set(x, "simple-repository", value.asInstanceOf[js.Any])
    
    inline def `setSimple-user`(value: Avatarurl): Self = StObject.set(x, "simple-user", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Detector): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def `setSocial-account`(value: Provider): Self = StObject.set(x, "social-account", value.asInstanceOf[js.Any])
    
    inline def `setSsh-signing-key`(value: CreatedatIdKey): Self = StObject.set(x, "ssh-signing-key", value.asInstanceOf[js.Any])
    
    inline def setStargazer(value: Starredat): Self = StObject.set(x, "stargazer", value.asInstanceOf[js.Any])
    
    inline def `setStarred-repository`(value: RepoStarredat): Self = StObject.set(x, "starred-repository", value.asInstanceOf[js.Any])
    
    inline def `setState-change-issue-event`(value: Statereason): Self = StObject.set(x, "state-change-issue-event", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AvatarurlContext): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def `setStatus-check-policy`(value: Strict): Self = StObject.set(x, "status-check-policy", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Tarballurl): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def `setTag-protection`(value: CreatedatEnabled): Self = StObject.set(x, "tag-protection", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: Membersurl): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def `setTeam-discussion`(value: Bodyversion): Self = StObject.set(x, "team-discussion", value.asInstanceOf[js.Any])
    
    inline def `setTeam-discussion-comment`(value: Discussionurl): Self = StObject.set(x, "team-discussion-comment", value.asInstanceOf[js.Any])
    
    inline def `setTeam-full`(value: Memberscount): Self = StObject.set(x, "team-full", value.asInstanceOf[js.Any])
    
    inline def `setTeam-membership`(value: RoleState): Self = StObject.set(x, "team-membership", value.asInstanceOf[js.Any])
    
    inline def `setTeam-organization`(value: Company): Self = StObject.set(x, "team-organization", value.asInstanceOf[js.Any])
    
    inline def `setTeam-project`(value: Number): Self = StObject.set(x, "team-project", value.asInstanceOf[js.Any])
    
    inline def `setTeam-repository`(value: Cloneurl): Self = StObject.set(x, "team-repository", value.asInstanceOf[js.Any])
    
    inline def `setTeam-simple`(value: Ldapdn): Self = StObject.set(x, "team-simple", value.asInstanceOf[js.Any])
    
    inline def setThread(value: Repository): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    
    inline def `setThread-subscription`(value: Repositoryurl): Self = StObject.set(x, "thread-subscription", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-assigned-issue-event`(value: AssigneeCommitid): Self = StObject.set(x, "timeline-assigned-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-comment-event`(value: ActorAuthorassociation): Self = StObject.set(x, "timeline-comment-event", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-commit-commented-event`(value: CommentsCommitid): Self = StObject.set(x, "timeline-commit-commented-event", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-committed-event`(value: CommitterEvent): Self = StObject.set(x, "timeline-committed-event", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-cross-referenced-event`(value: ActorCreatedat): Self = StObject.set(x, "timeline-cross-referenced-event", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-issue-events`(
      value: EventId_ | IdMilestone | PerformedviagithubappRename | Requestedteam | CreatedatDismissedreview | IdLockreason | PerformedviagithubappProjectcard | ProjectcardUrl | BodyBodyhtml | EventSource | CommitterEvent | Submittedat | EventNodeid | CommitidEvent | PerformedviagithubappUrl | PerformedviagithubappStatereason
    ): Self = StObject.set(x, "timeline-issue-events", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-line-commented-event`(value: CommentsEvent): Self = StObject.set(x, "timeline-line-commented-event", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-reviewed-event`(value: Pullrequesturl): Self = StObject.set(x, "timeline-reviewed-event", value.asInstanceOf[js.Any])
    
    inline def `setTimeline-unassigned-issue-event`(value: AssigneeCommitid): Self = StObject.set(x, "timeline-unassigned-issue-event", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: Names): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def `setTopic-search-result-item`(value: Aliases): Self = StObject.set(x, "topic-search-result-item", value.asInstanceOf[js.Any])
    
    inline def setTraffic(value: Count): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def `setUnassigned-issue-event`(value: AssigneeAssigner): Self = StObject.set(x, "unassigned-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setUnlabeled-issue-event`(value: ActorCommitid): Self = StObject.set(x, "unlabeled-issue-event", value.asInstanceOf[js.Any])
    
    inline def `setUser-marketplace-purchase`(value: Freetrialendson): Self = StObject.set(x, "user-marketplace-purchase", value.asInstanceOf[js.Any])
    
    inline def `setUser-search-result-item`(value: Followers): Self = StObject.set(x, "user-search-result-item", value.asInstanceOf[js.Any])
    
    inline def `setValidation-error`(value: DocumentationurlErrorsMessage): Self = StObject.set(x, "validation-error", value.asInstanceOf[js.Any])
    
    inline def `setValidation-error-simple`(value: ErrorsMessage): Self = StObject.set(x, "validation-error-simple", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Signature): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def `setView-traffic`(value: Views): Self = StObject.set(x, "view-traffic", value.asInstanceOf[js.Any])
    
    inline def `setWait-timer`(value: Double): Self = StObject.set(x, "wait-timer", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-branch-protection-rule-created`(value: Installation): Self = StObject.set(x, "webhook-branch-protection-rule-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-branch-protection-rule-deleted`(value: Rule): Self = StObject.set(x, "webhook-branch-protection-rule-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-branch-protection-rule-edited`(value: Changes): Self = StObject.set(x, "webhook-branch-protection-rule-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-completed`(value: Checkrun): Self = StObject.set(x, "webhook-check-run-completed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-completed-form-encoded`(value: PayloadString): Self = StObject.set(x, "webhook-check-run-completed-form-encoded", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-created`(value: Sender): Self = StObject.set(x, "webhook-check-run-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-created-form-encoded`(value: PayloadString): Self = StObject.set(x, "webhook-check-run-created-form-encoded", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-requested-action`(value: Requestedaction): Self = StObject.set(x, "webhook-check-run-requested-action", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-requested-action-form-encoded`(value: PayloadString): Self = StObject.set(x, "webhook-check-run-requested-action-form-encoded", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-rerequested`(value: ActionCheckrun): Self = StObject.set(x, "webhook-check-run-rerequested", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-run-rerequested-form-encoded`(value: PayloadString): Self = StObject.set(x, "webhook-check-run-rerequested-form-encoded", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-suite-completed`(value: Actionsmeta): Self = StObject.set(x, "webhook-check-suite-completed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-suite-requested`(value: ActionActionsmeta): Self = StObject.set(x, "webhook-check-suite-requested", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-check-suite-rerequested`(value: ActionsmetaChecksuite): Self = StObject.set(x, "webhook-check-suite-rerequested", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-code-scanning-alert-appeared-in-branch`(value: Alert): Self = StObject.set(x, "webhook-code-scanning-alert-appeared-in-branch", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-code-scanning-alert-closed-by-user`(value: Commitoid): Self = StObject.set(x, "webhook-code-scanning-alert-closed-by-user", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-code-scanning-alert-created`(value: ActionAlert): Self = StObject.set(x, "webhook-code-scanning-alert-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-code-scanning-alert-fixed`(value: AlertCommitoid): Self = StObject.set(x, "webhook-code-scanning-alert-fixed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-code-scanning-alert-reopened`(value: CommitoidEnterprise): Self = StObject.set(x, "webhook-code-scanning-alert-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-code-scanning-alert-reopened-by-user`(value: EnterpriseInstallation): Self = StObject.set(x, "webhook-code-scanning-alert-reopened-by-user", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-commit-comment-created`(value: ActionComment): Self = StObject.set(x, "webhook-commit-comment-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-config`(value: ContenttypeInsecuressl): Self = StObject.set(x, "webhook-config", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-config-content-type`(value: String): Self = StObject.set(x, "webhook-config-content-type", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-config-insecure-ssl`(value: String | Double): Self = StObject.set(x, "webhook-config-insecure-ssl", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-config-secret`(value: String): Self = StObject.set(x, "webhook-config-secret", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-config-url`(value: String): Self = StObject.set(x, "webhook-config-url", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-create`(value: Masterbranch): Self = StObject.set(x, "webhook-create", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-delete`(value: Pushertype): Self = StObject.set(x, "webhook-delete", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-dependabot-alert-auto-dismissed`(value: AlertEnterprise): Self = StObject.set(x, "webhook-dependabot-alert-auto-dismissed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-dependabot-alert-auto-reopened`(value: InstallationOrganization): Self = StObject.set(x, "webhook-dependabot-alert-auto-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-dependabot-alert-created`(value: OrganizationRepository): Self = StObject.set(x, "webhook-dependabot-alert-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-dependabot-alert-dismissed`(value: RepositorySender): Self = StObject.set(x, "webhook-dependabot-alert-dismissed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-dependabot-alert-fixed`(value: ActionAlertEnterprise): Self = StObject.set(x, "webhook-dependabot-alert-fixed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-dependabot-alert-reintroduced`(value: AlertEnterpriseInstallation): Self = StObject.set(x, "webhook-dependabot-alert-reintroduced", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-dependabot-alert-reopened`(value: EnterpriseInstallationOrganization): Self = StObject.set(x, "webhook-dependabot-alert-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-deploy-key-created`(value: ActionEnterprise): Self = StObject.set(x, "webhook-deploy-key-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-deploy-key-deleted`(value: InstallationKey): Self = StObject.set(x, "webhook-deploy-key-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-deployment-created`(value: Workflow): Self = StObject.set(x, "webhook-deployment-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-deployment-protection-rule-requested`(value: Deploymentcallbackurl): Self = StObject.set(x, "webhook-deployment-protection-rule-requested", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-deployment-status-created`(value: Deploymentstatus): Self = StObject.set(x, "webhook-deployment-status-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-answered`(value: Answer): Self = StObject.set(x, "webhook-discussion-answered", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-category-changed`(value: Discussion): Self = StObject.set(x, "webhook-discussion-category-changed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-closed`(value: ActionDiscussion): Self = StObject.set(x, "webhook-discussion-closed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-comment-created`(value: CommentDiscussion): Self = StObject.set(x, "webhook-discussion-comment-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-comment-deleted`(value: DiscussionEnterprise): Self = StObject.set(x, "webhook-discussion-comment-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-comment-edited`(value: ActionChanges): Self = StObject.set(x, "webhook-discussion-comment-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-created`(value: ActionDiscussionEnterprise): Self = StObject.set(x, "webhook-discussion-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-deleted`(value: DiscussionEnterpriseInstallation): Self = StObject.set(x, "webhook-discussion-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-edited`(value: ChangesDiscussion): Self = StObject.set(x, "webhook-discussion-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-labeled`(value: InstallationLabel): Self = StObject.set(x, "webhook-discussion-labeled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-locked`(value: InstallationOrganizationRepository): Self = StObject.set(x, "webhook-discussion-locked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-pinned`(value: OrganizationRepositorySender): Self = StObject.set(x, "webhook-discussion-pinned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-reopened`(value: ActionDiscussionEnterpriseInstallation): Self = StObject.set(x, "webhook-discussion-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-transferred`(value: ActionChangesDiscussion): Self = StObject.set(x, "webhook-discussion-transferred", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-unanswered`(value: Oldanswer): Self = StObject.set(x, "webhook-discussion-unanswered", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-unlabeled`(value: LabelOrganization): Self = StObject.set(x, "webhook-discussion-unlabeled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-unlocked`(value: DiscussionEnterpriseInstallationOrganization): Self = StObject.set(x, "webhook-discussion-unlocked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-discussion-unpinned`(value: EnterpriseInstallationOrganizationRepository): Self = StObject.set(x, "webhook-discussion-unpinned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-fork`(value: Forkee): Self = StObject.set(x, "webhook-fork", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-github-app-authorization-revoked`(value: ActionEnterpriseInstallation): Self = StObject.set(x, "webhook-github-app-authorization-revoked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-gollum`(value: Pages): Self = StObject.set(x, "webhook-gollum", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-created`(value: Requester): Self = StObject.set(x, "webhook-installation-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-deleted`(value: OrganizationRepositories): Self = StObject.set(x, "webhook-installation-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-new-permissions-accepted`(value: RepositoriesRepository): Self = StObject.set(x, "webhook-installation-new-permissions-accepted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-repositories-added`(value: Repositoriesadded): Self = StObject.set(x, "webhook-installation-repositories-added", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-repositories-removed`(value: Repositoriesremoved): Self = StObject.set(x, "webhook-installation-repositories-removed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-suspend`(value: RepositoryRequester): Self = StObject.set(x, "webhook-installation-suspend", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-target-renamed`(value: Targettype): Self = StObject.set(x, "webhook-installation-target-renamed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-installation-unsuspend`(value: RequesterSender): Self = StObject.set(x, "webhook-installation-unsuspend", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issue-comment-created`(value: CommentEnterprise): Self = StObject.set(x, "webhook-issue-comment-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issue-comment-deleted`(value: InstallationIssue): Self = StObject.set(x, "webhook-issue-comment-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issue-comment-edited`(value: ChangesComment): Self = StObject.set(x, "webhook-issue-comment-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-assigned`(value: ActionAssignee): Self = StObject.set(x, "webhook-issues-assigned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-closed`(value: IssueOrganization): Self = StObject.set(x, "webhook-issues-closed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-deleted`(value: EnterpriseInstallationIssue): Self = StObject.set(x, "webhook-issues-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-demilestoned`(value: IssueMilestone): Self = StObject.set(x, "webhook-issues-demilestoned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-edited`(value: ChangesEnterprise): Self = StObject.set(x, "webhook-issues-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-labeled`(value: IssueLabel): Self = StObject.set(x, "webhook-issues-labeled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-locked`(value: InstallationIssueOrganization): Self = StObject.set(x, "webhook-issues-locked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-milestoned`(value: MilestoneOrganization): Self = StObject.set(x, "webhook-issues-milestoned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-opened`(value: ActionChangesEnterprise): Self = StObject.set(x, "webhook-issues-opened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-pinned`(value: IssueOrganizationRepository): Self = StObject.set(x, "webhook-issues-pinned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-reopened`(value: ActionEnterpriseInstallationIssue): Self = StObject.set(x, "webhook-issues-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-transferred`(value: ChangesEnterpriseInstallation): Self = StObject.set(x, "webhook-issues-transferred", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-unassigned`(value: AssigneeEnterprise): Self = StObject.set(x, "webhook-issues-unassigned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-unlabeled`(value: InstallationIssueLabel): Self = StObject.set(x, "webhook-issues-unlabeled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-unlocked`(value: EnterpriseInstallationIssueOrganization): Self = StObject.set(x, "webhook-issues-unlocked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-issues-unpinned`(value: InstallationIssueOrganizationRepository): Self = StObject.set(x, "webhook-issues-unpinned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-label-created`(value: EnterpriseInstallationLabel): Self = StObject.set(x, "webhook-label-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-label-deleted`(value: InstallationLabelOrganization): Self = StObject.set(x, "webhook-label-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-label-edited`(value: LabelOrganizationRepository): Self = StObject.set(x, "webhook-label-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-marketplace-purchase-cancelled`(value: Marketplacepurchase): Self = StObject.set(x, "webhook-marketplace-purchase-cancelled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-marketplace-purchase-changed`(value: Previousmarketplacepurchase): Self = StObject.set(x, "webhook-marketplace-purchase-changed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-marketplace-purchase-pending-change`(value: ActionEffectivedate): Self = StObject.set(x, "webhook-marketplace-purchase-pending-change", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-marketplace-purchase-pending-change-cancelled`(value: EffectivedateEnterprise): Self = StObject.set(x, "webhook-marketplace-purchase-pending-change-cancelled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-marketplace-purchase-purchased`(value: InstallationMarketplacepurchase): Self = StObject.set(x, "webhook-marketplace-purchase-purchased", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-member-added`(value: Member): Self = StObject.set(x, "webhook-member-added", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-member-edited`(value: InstallationMember): Self = StObject.set(x, "webhook-member-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-member-removed`(value: MemberOrganization): Self = StObject.set(x, "webhook-member-removed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-membership-added`(value: Team): Self = StObject.set(x, "webhook-membership-added", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-membership-removed`(value: RepositoryScope): Self = StObject.set(x, "webhook-membership-removed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-merge-group-checks-requested`(value: Mergegroup): Self = StObject.set(x, "webhook-merge-group-checks-requested", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-merge-group-destroyed`(value: ActionInstallation): Self = StObject.set(x, "webhook-merge-group-destroyed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-meta-deleted`(value: Hook): Self = StObject.set(x, "webhook-meta-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-milestone-closed`(value: InstallationMilestone): Self = StObject.set(x, "webhook-milestone-closed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-milestone-created`(value: EnterpriseInstallationMilestone): Self = StObject.set(x, "webhook-milestone-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-milestone-deleted`(value: InstallationMilestoneOrganization): Self = StObject.set(x, "webhook-milestone-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-milestone-edited`(value: MilestoneOrganizationRepository): Self = StObject.set(x, "webhook-milestone-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-milestone-opened`(value: ActionEnterpriseInstallationMilestone): Self = StObject.set(x, "webhook-milestone-opened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-org-block-blocked`(value: Blockeduser): Self = StObject.set(x, "webhook-org-block-blocked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-org-block-unblocked`(value: ActionBlockeduser): Self = StObject.set(x, "webhook-org-block-unblocked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-organization-deleted`(value: Membership): Self = StObject.set(x, "webhook-organization-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-organization-member-added`(value: InstallationMembership): Self = StObject.set(x, "webhook-organization-member-added", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-organization-member-invited`(value: Invitation): Self = StObject.set(x, "webhook-organization-member-invited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-organization-member-removed`(value: MembershipOrganization): Self = StObject.set(x, "webhook-organization-member-removed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-organization-renamed`(value: EnterpriseInstallationMembership): Self = StObject.set(x, "webhook-organization-renamed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-package-published`(value: OrganizationPackage): Self = StObject.set(x, "webhook-package-published", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-package-updated`(value: PackageRepository): Self = StObject.set(x, "webhook-package-updated", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-page-build`(value: Build): Self = StObject.set(x, "webhook-page-build", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-personal-access-token-request-approved`(value: Personalaccesstokenrequest): Self = StObject.set(x, "webhook-personal-access-token-request-approved", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-personal-access-token-request-cancelled`(value: OrganizationPersonalaccesstokenrequest): Self = StObject.set(x, "webhook-personal-access-token-request-cancelled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-personal-access-token-request-created`(value: PersonalaccesstokenrequestSender): Self = StObject.set(x, "webhook-personal-access-token-request-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-personal-access-token-request-denied`(value: ActionInstallationOrganization): Self = StObject.set(x, "webhook-personal-access-token-request-denied", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-ping`(value: Zen): Self = StObject.set(x, "webhook-ping", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-ping-form-encoded`(value: PayloadString): Self = StObject.set(x, "webhook-ping-form-encoded", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-card-converted`(value: OrganizationProjectcard): Self = StObject.set(x, "webhook-project-card-converted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-card-created`(value: ProjectcardRepository): Self = StObject.set(x, "webhook-project-card-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-card-deleted`(value: InstallationOrganizationProjectcard): Self = StObject.set(x, "webhook-project-card-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-card-edited`(value: OrganizationProjectcardRepository): Self = StObject.set(x, "webhook-project-card-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-card-moved`(value: ProjectcardRepositorySender): Self = StObject.set(x, "webhook-project-card-moved", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-closed`(value: Project): Self = StObject.set(x, "webhook-project-closed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-column-created`(value: Projectcolumn): Self = StObject.set(x, "webhook-project-column-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-column-deleted`(value: OrganizationProjectcolumn): Self = StObject.set(x, "webhook-project-column-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-column-edited`(value: ProjectcolumnRepository): Self = StObject.set(x, "webhook-project-column-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-column-moved`(value: InstallationOrganizationProjectcolumn): Self = StObject.set(x, "webhook-project-column-moved", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-created`(value: OrganizationProject): Self = StObject.set(x, "webhook-project-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-deleted`(value: ProjectRepository): Self = StObject.set(x, "webhook-project-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-edited`(value: InstallationOrganizationProject): Self = StObject.set(x, "webhook-project-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-project-reopened`(value: OrganizationProjectRepository): Self = StObject.set(x, "webhook-project-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-item-archived`(value: Projectsv2item): Self = StObject.set(x, "webhook-projects-v2-item-archived", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-item-converted`(value: ChangesInstallation): Self = StObject.set(x, "webhook-projects-v2-item-converted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-item-created`(value: OrganizationProjectsv2item): Self = StObject.set(x, "webhook-projects-v2-item-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-item-deleted`(value: Projectsv2itemSender): Self = StObject.set(x, "webhook-projects-v2-item-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-item-edited`(value: ActionChangesInstallation): Self = StObject.set(x, "webhook-projects-v2-item-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-item-reordered`(value: ChangesInstallationOrganization): Self = StObject.set(x, "webhook-projects-v2-item-reordered", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-item-restored`(value: InstallationOrganizationProjectsv2item): Self = StObject.set(x, "webhook-projects-v2-item-restored", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-project-closed`(value: Projectsv2): Self = StObject.set(x, "webhook-projects-v2-project-closed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-project-created`(value: ActionOrganization): Self = StObject.set(x, "webhook-projects-v2-project-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-project-deleted`(value: OrganizationProjectsv2): Self = StObject.set(x, "webhook-projects-v2-project-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-project-edited`(value: ChangesOrganization): Self = StObject.set(x, "webhook-projects-v2-project-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-projects-v2-project-reopened`(value: Projectsv2Sender): Self = StObject.set(x, "webhook-projects-v2-project-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-public`(value: InstallationOrganizationRepositorySender): Self = StObject.set(x, "webhook-public", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-assigned`(value: InstallationNumber): Self = StObject.set(x, "webhook-pull-request-assigned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-auto-merge-disabled`(value: NumberOrganization): Self = StObject.set(x, "webhook-pull-request-auto-merge-disabled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-auto-merge-enabled`(value: OrganizationPullrequest): Self = StObject.set(x, "webhook-pull-request-auto-merge-enabled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-closed`(value: PullrequestRepository): Self = StObject.set(x, "webhook-pull-request-closed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-converted-to-draft`(value: EnterpriseInstallationNumber): Self = StObject.set(x, "webhook-pull-request-converted-to-draft", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-demilestoned`(value: EnterpriseMilestone): Self = StObject.set(x, "webhook-pull-request-demilestoned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-dequeued`(value: PullrequestReason): Self = StObject.set(x, "webhook-pull-request-dequeued", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-edited`(value: InstallationNumberOrganization): Self = StObject.set(x, "webhook-pull-request-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-enqueued`(value: NumberOrganizationPullrequest): Self = StObject.set(x, "webhook-pull-request-enqueued", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-labeled`(value: LabelNumber): Self = StObject.set(x, "webhook-pull-request-labeled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-locked`(value: OrganizationPullrequestRepository): Self = StObject.set(x, "webhook-pull-request-locked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-milestoned`(value: MilestoneNumber_): Self = StObject.set(x, "webhook-pull-request-milestoned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-opened`(value: PullrequestRepositorySender): Self = StObject.set(x, "webhook-pull-request-opened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-ready-for-review`(value: ActionEnterpriseInstallationNumber): Self = StObject.set(x, "webhook-pull-request-ready-for-review", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-reopened`(value: EnterpriseInstallationNumberOrganization): Self = StObject.set(x, "webhook-pull-request-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-comment-created`(value: ActionCommentEnterprise): Self = StObject.set(x, "webhook-pull-request-review-comment-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-comment-deleted`(value: CommentEnterpriseInstallation): Self = StObject.set(x, "webhook-pull-request-review-comment-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-comment-edited`(value: ActionChangesComment): Self = StObject.set(x, "webhook-pull-request-review-comment-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-dismissed`(value: Review): Self = StObject.set(x, "webhook-pull-request-review-dismissed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-edited`(value: RepositoryReview): Self = StObject.set(x, "webhook-pull-request-review-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-request-removed`(value: OneOf[js.Tuple2[RepositoryRequestedreviewer, RepositoryRequestedteam]]): Self = StObject.set(x, "webhook-pull-request-review-request-removed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-requested`(value: OneOf[js.Tuple2[RequestedreviewerSender, RequestedteamSender]]): Self = StObject.set(x, "webhook-pull-request-review-requested", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-submitted`(value: ReviewSender): Self = StObject.set(x, "webhook-pull-request-review-submitted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-thread-resolved`(value: Thread): Self = StObject.set(x, "webhook-pull-request-review-thread-resolved", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-review-thread-unresolved`(value: SenderThread): Self = StObject.set(x, "webhook-pull-request-review-thread-unresolved", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-synchronize`(value: ActionAfter): Self = StObject.set(x, "webhook-pull-request-synchronize", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-unassigned`(value: ActionAssigneeEnterprise): Self = StObject.set(x, "webhook-pull-request-unassigned", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-unlabeled`(value: InstallationLabelNumber): Self = StObject.set(x, "webhook-pull-request-unlabeled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-pull-request-unlocked`(value: InstallationNumberOrganizationPullrequest): Self = StObject.set(x, "webhook-pull-request-unlocked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-push`(value: Compare): Self = StObject.set(x, "webhook-push", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-registry-package-published`(value: Registrypackage): Self = StObject.set(x, "webhook-registry-package-published", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-registry-package-updated`(value: OrganizationRegistrypackage): Self = StObject.set(x, "webhook-registry-package-updated", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-release-created`(value: Release): Self = StObject.set(x, "webhook-release-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-release-deleted`(value: OrganizationRelease): Self = StObject.set(x, "webhook-release-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-release-edited`(value: ReleaseRepository): Self = StObject.set(x, "webhook-release-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-release-prereleased`(value: InstallationOrganizationRelease): Self = StObject.set(x, "webhook-release-prereleased", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-release-published`(value: OrganizationReleaseRepository): Self = StObject.set(x, "webhook-release-published", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-release-released`(value: ReleaseRepositorySender): Self = StObject.set(x, "webhook-release-released", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-release-unpublished`(value: ActionEnterpriseInstallationOrganization): Self = StObject.set(x, "webhook-release-unpublished", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-advisory-published`(value: Repositoryadvisory): Self = StObject.set(x, "webhook-repository-advisory-published", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-advisory-reported`(value: RepositoryRepositoryadvisory): Self = StObject.set(x, "webhook-repository-advisory-reported", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-archived`(value: ActionEnterpriseInstallationOrganizationRepository): Self = StObject.set(x, "webhook-repository-archived", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-created`(value: EnterpriseInstallationOrganizationRepositorySender): Self = StObject.set(x, "webhook-repository-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-deleted`(value: ActionEnterpriseInstallationOrganizationRepositorySender): Self = StObject.set(x, "webhook-repository-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-dispatch-sample`(value: ActionBranch): Self = StObject.set(x, "webhook-repository-dispatch-sample", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-edited`(value: ActionChangesEnterpriseInstallation): Self = StObject.set(x, "webhook-repository-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-import`(value: SenderStatus): Self = StObject.set(x, "webhook-repository-import", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-privatized`(value: RepositoryAllowupdatebranch): Self = StObject.set(x, "webhook-repository-privatized", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-publicized`(value: SenderAvatarurl): Self = StObject.set(x, "webhook-repository-publicized", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-renamed`(value: ChangesEnterpriseInstallationOrganization): Self = StObject.set(x, "webhook-repository-renamed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-transferred`(value: ActionChangesEnterpriseInstallationOrganization): Self = StObject.set(x, "webhook-repository-transferred", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-unarchived`(value: OrganizationRepositoryAllowupdatebranch): Self = StObject.set(x, "webhook-repository-unarchived", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-vulnerability-alert-create`(value: ActionAlertEnterpriseInstallation): Self = StObject.set(x, "webhook-repository-vulnerability-alert-create", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-vulnerability-alert-dismiss`(value: AlertEnterpriseInstallationOrganization): Self = StObject.set(x, "webhook-repository-vulnerability-alert-dismiss", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-vulnerability-alert-reopen`(value: ActionAlertEnterpriseInstallationOrganization): Self = StObject.set(x, "webhook-repository-vulnerability-alert-reopen", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-repository-vulnerability-alert-resolve`(value: AlertEnterpriseInstallationOrganizationRepository): Self = StObject.set(x, "webhook-repository-vulnerability-alert-resolve", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-rubygems-metadata`(value: Homepage): Self = StObject.set(x, "webhook-rubygems-metadata", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-secret-scanning-alert-created`(value: ActionAlertEnterpriseInstallationOrganizationRepository): Self = StObject.set(x, "webhook-secret-scanning-alert-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-secret-scanning-alert-location-created`(value: AlertInstallation): Self = StObject.set(x, "webhook-secret-scanning-alert-location-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-secret-scanning-alert-location-created-form-encoded`(value: PayloadString): Self = StObject.set(x, "webhook-secret-scanning-alert-location-created-form-encoded", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-secret-scanning-alert-reopened`(value: AlertEnterpriseInstallationOrganizationRepositorySender): Self = StObject.set(x, "webhook-secret-scanning-alert-reopened", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-secret-scanning-alert-resolved`(value: ActionAlertEnterpriseInstallationOrganizationRepositorySender): Self = StObject.set(x, "webhook-secret-scanning-alert-resolved", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-secret-scanning-alert-revoked`(value: AlertPushprotectionbypassedat): Self = StObject.set(x, "webhook-secret-scanning-alert-revoked", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-security-advisory-published`(value: RepositorySecurityadvisory): Self = StObject.set(x, "webhook-security-advisory-published", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-security-advisory-updated`(value: SecurityadvisorySender): Self = StObject.set(x, "webhook-security-advisory-updated", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-security-advisory-withdrawn`(value: OrganizationRepositorySecurityadvisory): Self = StObject.set(x, "webhook-security-advisory-withdrawn", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-security-and-analysis`(value: ChangesEnterpriseInstallationOrganizationRepository): Self = StObject.set(x, "webhook-security-and-analysis", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-sponsorship-cancelled`(value: Sponsorship): Self = StObject.set(x, "webhook-sponsorship-cancelled", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-sponsorship-created`(value: SenderSponsorship): Self = StObject.set(x, "webhook-sponsorship-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-sponsorship-edited`(value: RepositorySenderSponsorship): Self = StObject.set(x, "webhook-sponsorship-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-sponsorship-pending-cancellation`(value: ActionEffectivedateEnterprise): Self = StObject.set(x, "webhook-sponsorship-pending-cancellation", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-sponsorship-pending-tier-change`(value: ChangesEffectivedate): Self = StObject.set(x, "webhook-sponsorship-pending-tier-change", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-sponsorship-tier-changed`(value: OrganizationRepositorySenderSponsorship): Self = StObject.set(x, "webhook-sponsorship-tier-changed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-star-created`(value: SenderStarredat): Self = StObject.set(x, "webhook-star-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-star-deleted`(value: RepositorySenderStarredat): Self = StObject.set(x, "webhook-star-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-status`(value: Branches): Self = StObject.set(x, "webhook-status", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-team-add`(value: SenderTeam): Self = StObject.set(x, "webhook-team-add", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-team-added-to-repository`(value: RepositorySenderTeam): Self = StObject.set(x, "webhook-team-added-to-repository", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-team-created`(value: OrganizationRepositorySenderTeam): Self = StObject.set(x, "webhook-team-created", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-team-deleted`(value: InstallationOrganizationRepositorySenderTeam): Self = StObject.set(x, "webhook-team-deleted", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-team-edited`(value: ActionChangesEnterpriseInstallationOrganizationRepository): Self = StObject.set(x, "webhook-team-edited", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-team-removed-from-repository`(value: EnterpriseInstallationOrganizationRepositorySenderTeam): Self = StObject.set(x, "webhook-team-removed-from-repository", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-watch-started`(value: RepositoryAllowupdatebranchSenderAvatarurl): Self = StObject.set(x, "webhook-watch-started", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-dispatch`(value: EnterpriseInputs): Self = StObject.set(x, "webhook-workflow-dispatch", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-job-completed`(value: Workflowjob): Self = StObject.set(x, "webhook-workflow-job-completed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-job-in-progress`(value: ActionDeployment): Self = StObject.set(x, "webhook-workflow-job-in-progress", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-job-queued`(value: DeploymentEnterprise): Self = StObject.set(x, "webhook-workflow-job-queued", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-job-waiting`(value: SenderWorkflowjob): Self = StObject.set(x, "webhook-workflow-job-waiting", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-run-completed`(value: Workflowrun): Self = StObject.set(x, "webhook-workflow-run-completed", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-run-in-progress`(value: SenderWorkflow): Self = StObject.set(x, "webhook-workflow-run-in-progress", value.asInstanceOf[js.Any])
    
    inline def `setWebhook-workflow-run-requested`(value: WorkflowWorkflowrun): Self = StObject.set(x, "webhook-workflow-run-requested", value.asInstanceOf[js.Any])
    
    inline def setWorkflow(value: BadgeurlCreatedat): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run`(value: Artifactsurl): Self = StObject.set(x, "workflow-run", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-usage`(value: Rundurationms): Self = StObject.set(x, "workflow-run-usage", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-usage`(value: Billable): Self = StObject.set(x, "workflow-usage", value.asInstanceOf[js.Any])
    
    inline def set_package(value: Versioncount): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
