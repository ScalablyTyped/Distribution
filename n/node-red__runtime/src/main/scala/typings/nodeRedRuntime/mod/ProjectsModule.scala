package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.anon.AllowUnrelatedHistories
import typings.nodeRedRuntime.anon.Before
import typings.nodeRedRuntime.anon.Branch
import typings.nodeRedRuntime.anon.Create
import typings.nodeRedRuntime.anon.Force
import typings.nodeRedRuntime.anon.IdPath
import typings.nodeRedRuntime.anon.IdProject
import typings.nodeRedRuntime.anon.IdRemote
import typings.nodeRedRuntime.anon.IdRemoteReq
import typings.nodeRedRuntime.anon.Message
import typings.nodeRedRuntime.anon.PathReq
import typings.nodeRedRuntime.anon.Project
import typings.nodeRedRuntime.anon.Remote
import typings.nodeRedRuntime.anon.RemoteReq
import typings.nodeRedRuntime.anon.ReqType
import typings.nodeRedRuntime.anon.ReqUser
import typings.nodeRedRuntime.anon.Resolutions
import typings.nodeRedRuntime.anon.Sha
import typings.nodeRedRuntime.anon.Track
import typings.nodeRedRuntime.anon.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsModule extends StObject {
  
  /**
    * Abort an in-progress merge
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def abortMerge(opts: ReqUser): js.Promise[js.Object]
  
  /**
    *
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.remote - the remote metadata
    * @param opts.remote.name - the name of the remote
    * @param opts.remote.url - the url of the remote
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def addRemote(opts: IdRemote): js.Promise[js.Object]
  
  def available(): js.Promise[Boolean]
  
  /**
    * Commits the current staged files
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.message - the message to associate with the commit
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def commit(opts: Message): js.Promise[js.Object]
  
  /**
    * Create a new project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.project - the project information
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def createProject(opts: Project): js.Promise[js.Object]
  
  /**
    * Deletes a branch
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.branch - the name of the branch
    * @param opts.force - whether to force delete
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def deleteBranch(opts: Force): js.Promise[js.Object]
  
  /**
    * Deletes a project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project to update
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def deleteProject(opts: ReqUser): js.Promise[js.Object]
  
  /**
    * Gets the active project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns the active project
    */
  def getActiveProject(opts: typings.nodeRedRuntime.anon.User): js.Promise[js.Object]
  
  /**
    * Gets the status of a branch
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.branch - the name of the branch
    * @param opts.req - the request to log (optional)
    * @returns the status of the branch
    */
  def getBranchStatus(opts: Branch): js.Promise[js.Object]
  
  /**
    * Get a list of local branches
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.remote - whether to return remote branches (true) or local (false)
    * @param opts.req - the request to log (optional)
    * @returns a list of the local branches
    */
  def getBranches(opts: Remote): js.Promise[js.Object]
  
  /**
    * Gets the details of a single commit
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.sha - the sha of the commit to return
    * @param opts.req - the request to log (optional)
    * @returns the commit details
    */
  def getCommit(opts: Sha): js.Promise[js.Object]
  
  /**
    * Gets the commit history of the project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.limit - limit how many to return
    * @param opts.before - id of the commit to work back from
    * @param opts.req - the request to log (optional)
    * @returns an array of commits
    */
  def getCommits(opts: Before): js.Promise[js.Array[js.Object]]
  
  /**
    * Gets the contents of a file
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.path - the path of the file
    * @param opts.tree - the version control tree to use
    * @param opts.req - the request to log (optional)
    * @returns the content of the file
    */
  def getFile(opts: Tree): js.Promise[String]
  
  /**
    * Get the diff of a file
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.path - the path of the file
    * @param opts.type - the type of diff
    * @param opts.req - the request to log (optional)
    * @returns the requested diff
    */
  def getFileDiff(opts: ReqType): js.Promise[js.Object]
  
  /**
    * Gets a listing of the files in the project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.req - the request to log (optional)
    * @returns the file listing
    */
  def getFiles(opts: ReqUser): js.Promise[js.Object]
  
  /**
    * Gets a projects metadata
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project to get
    * @param opts.req - the request to log (optional)
    * @returns the project metadata
    */
  def getProject(opts: ReqUser): js.Promise[js.Object]
  
  /**
    * Gets a list of the project remotes
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.req - the request to log (optional)
    * @returns a list of project remotes
    */
  def getRemotes(opts: ReqUser): js.Promise[js.Object]
  
  /**
    * Gets current git status of a project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.remote - whether to include status of remote repos
    * @param opts.req - the request to log (optional)
    * @returns the project status
    */
  def getStatus(opts: Remote): js.Promise[js.Object]
  
  /**
    * Initialises an empty project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project to initialise
    * @param opts.project - the project information
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def initialiseProject(opts: IdProject): js.Promise[js.Object]
  
  /**
    * List projects known to the runtime
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def listProjects(opts: typings.nodeRedRuntime.anon.User): js.Promise[Unit]
  
  /**
    * Pull changes from the remote
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.remote - the remote to pull
    * @param opts.track - whether to track this remote
    * @param opts.allowUnrelatedHistories -
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def pull(opts: AllowUnrelatedHistories): js.Promise[js.Object]
  
  /**
    * Push changes to a remote
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.remote - the name of the remote
    * @param opts.track - whether to set the remote as the upstream
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def push(opts: Track): js.Promise[js.Object]
  
  /**
    * Remove a project remote
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.remote - the name of the remote
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def removeRemote(opts: RemoteReq): js.Promise[js.Object]
  
  /**
    * Resolves a merge conflict
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.path - the path of the file being merged
    * @param opts.resolutions - how to resolve the merge conflict
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def resolveMerge(opts: Resolutions): js.Promise[js.Object]
  
  /**
    * Reverts changes to a file back to its commited version
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.path - the path of the file
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def revertFile(opts: PathReq): js.Promise[js.Object]
  
  /**
    *
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project to activate
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def setActiveProject(opts: ReqUser): js.Promise[js.Object]
  
  /**
    * Sets the current local branch
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.branch - the name of the branch
    * @param opts.create - whether to create the branch if it doesn't exist
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def setBranch(opts: Create): js.Promise[js.Object]
  
  /**
    *
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.path - the path of the file, or an array of paths
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def stageFile(opts: IdPath): js.Promise[js.Object]
  
  /**
    *
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.path - the path of the file. If not set, all staged files are unstaged
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def unstageFile(opts: PathReq): js.Promise[js.Object]
  
  /**
    * Updates the metadata of an existing project
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project to update
    * @param opts.project - the project information
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def updateProject(opts: IdProject): js.Promise[js.Object]
  
  /**
    *
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the project
    * @param opts.remote - the remote metadata
    * @param opts.remote.name - the name of the remote
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def updateRemote(opts: IdRemoteReq): js.Promise[js.Object]
}
object ProjectsModule {
  
  @scala.inline
  def apply(
    abortMerge: ReqUser => js.Promise[js.Object],
    addRemote: IdRemote => js.Promise[js.Object],
    available: () => js.Promise[Boolean],
    commit: Message => js.Promise[js.Object],
    createProject: Project => js.Promise[js.Object],
    deleteBranch: Force => js.Promise[js.Object],
    deleteProject: ReqUser => js.Promise[js.Object],
    getActiveProject: typings.nodeRedRuntime.anon.User => js.Promise[js.Object],
    getBranchStatus: Branch => js.Promise[js.Object],
    getBranches: Remote => js.Promise[js.Object],
    getCommit: Sha => js.Promise[js.Object],
    getCommits: Before => js.Promise[js.Array[js.Object]],
    getFile: Tree => js.Promise[String],
    getFileDiff: ReqType => js.Promise[js.Object],
    getFiles: ReqUser => js.Promise[js.Object],
    getProject: ReqUser => js.Promise[js.Object],
    getRemotes: ReqUser => js.Promise[js.Object],
    getStatus: Remote => js.Promise[js.Object],
    initialiseProject: IdProject => js.Promise[js.Object],
    listProjects: typings.nodeRedRuntime.anon.User => js.Promise[Unit],
    pull: AllowUnrelatedHistories => js.Promise[js.Object],
    push: Track => js.Promise[js.Object],
    removeRemote: RemoteReq => js.Promise[js.Object],
    resolveMerge: Resolutions => js.Promise[js.Object],
    revertFile: PathReq => js.Promise[js.Object],
    setActiveProject: ReqUser => js.Promise[js.Object],
    setBranch: Create => js.Promise[js.Object],
    stageFile: IdPath => js.Promise[js.Object],
    unstageFile: PathReq => js.Promise[js.Object],
    updateProject: IdProject => js.Promise[js.Object],
    updateRemote: IdRemoteReq => js.Promise[js.Object]
  ): ProjectsModule = {
    val __obj = js.Dynamic.literal(abortMerge = js.Any.fromFunction1(abortMerge), addRemote = js.Any.fromFunction1(addRemote), available = js.Any.fromFunction0(available), commit = js.Any.fromFunction1(commit), createProject = js.Any.fromFunction1(createProject), deleteBranch = js.Any.fromFunction1(deleteBranch), deleteProject = js.Any.fromFunction1(deleteProject), getActiveProject = js.Any.fromFunction1(getActiveProject), getBranchStatus = js.Any.fromFunction1(getBranchStatus), getBranches = js.Any.fromFunction1(getBranches), getCommit = js.Any.fromFunction1(getCommit), getCommits = js.Any.fromFunction1(getCommits), getFile = js.Any.fromFunction1(getFile), getFileDiff = js.Any.fromFunction1(getFileDiff), getFiles = js.Any.fromFunction1(getFiles), getProject = js.Any.fromFunction1(getProject), getRemotes = js.Any.fromFunction1(getRemotes), getStatus = js.Any.fromFunction1(getStatus), initialiseProject = js.Any.fromFunction1(initialiseProject), listProjects = js.Any.fromFunction1(listProjects), pull = js.Any.fromFunction1(pull), push = js.Any.fromFunction1(push), removeRemote = js.Any.fromFunction1(removeRemote), resolveMerge = js.Any.fromFunction1(resolveMerge), revertFile = js.Any.fromFunction1(revertFile), setActiveProject = js.Any.fromFunction1(setActiveProject), setBranch = js.Any.fromFunction1(setBranch), stageFile = js.Any.fromFunction1(stageFile), unstageFile = js.Any.fromFunction1(unstageFile), updateProject = js.Any.fromFunction1(updateProject), updateRemote = js.Any.fromFunction1(updateRemote))
    __obj.asInstanceOf[ProjectsModule]
  }
  
  @scala.inline
  implicit class ProjectsModuleMutableBuilder[Self <: ProjectsModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortMerge(value: ReqUser => js.Promise[js.Object]): Self = StObject.set(x, "abortMerge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddRemote(value: IdRemote => js.Promise[js.Object]): Self = StObject.set(x, "addRemote", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAvailable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "available", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommit(value: Message => js.Promise[js.Object]): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateProject(value: Project => js.Promise[js.Object]): Self = StObject.set(x, "createProject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteBranch(value: Force => js.Promise[js.Object]): Self = StObject.set(x, "deleteBranch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteProject(value: ReqUser => js.Promise[js.Object]): Self = StObject.set(x, "deleteProject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActiveProject(value: typings.nodeRedRuntime.anon.User => js.Promise[js.Object]): Self = StObject.set(x, "getActiveProject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBranchStatus(value: Branch => js.Promise[js.Object]): Self = StObject.set(x, "getBranchStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBranches(value: Remote => js.Promise[js.Object]): Self = StObject.set(x, "getBranches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCommit(value: Sha => js.Promise[js.Object]): Self = StObject.set(x, "getCommit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCommits(value: Before => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "getCommits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFile(value: Tree => js.Promise[String]): Self = StObject.set(x, "getFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFileDiff(value: ReqType => js.Promise[js.Object]): Self = StObject.set(x, "getFileDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFiles(value: ReqUser => js.Promise[js.Object]): Self = StObject.set(x, "getFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProject(value: ReqUser => js.Promise[js.Object]): Self = StObject.set(x, "getProject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRemotes(value: ReqUser => js.Promise[js.Object]): Self = StObject.set(x, "getRemotes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStatus(value: Remote => js.Promise[js.Object]): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialiseProject(value: IdProject => js.Promise[js.Object]): Self = StObject.set(x, "initialiseProject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListProjects(value: typings.nodeRedRuntime.anon.User => js.Promise[Unit]): Self = StObject.set(x, "listProjects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPull(value: AllowUnrelatedHistories => js.Promise[js.Object]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(value: Track => js.Promise[js.Object]): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveRemote(value: RemoteReq => js.Promise[js.Object]): Self = StObject.set(x, "removeRemote", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveMerge(value: Resolutions => js.Promise[js.Object]): Self = StObject.set(x, "resolveMerge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRevertFile(value: PathReq => js.Promise[js.Object]): Self = StObject.set(x, "revertFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveProject(value: ReqUser => js.Promise[js.Object]): Self = StObject.set(x, "setActiveProject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBranch(value: Create => js.Promise[js.Object]): Self = StObject.set(x, "setBranch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStageFile(value: IdPath => js.Promise[js.Object]): Self = StObject.set(x, "stageFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnstageFile(value: PathReq => js.Promise[js.Object]): Self = StObject.set(x, "unstageFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateProject(value: IdProject => js.Promise[js.Object]): Self = StObject.set(x, "updateProject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRemote(value: IdRemoteReq => js.Promise[js.Object]): Self = StObject.set(x, "updateRemote", js.Any.fromFunction1(value))
  }
}
