package typings.nodeRedmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-redmine", "Redmine")
  @js.native
  class Redmine protected () extends StObject {
    def this(host: String, config: js.Any, port: Double) = this()
    
    def add_watcher(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    
    def create_issue(issue: IssueData, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issue = js.native
    
    def create_issue_relation(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    
    def delete_issue(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    
    def delete_issue_relation(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    
    def get_issue_by_id(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issue = js.native
    
    def issue_relation_by_id(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    
    /////////////////////////////////////// REST API for Issue Relations(Alpha) ///////////////////////////////////////
    def issue_relation_by_issue_id(id: Double, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    
    /////////////////////////////////////// REST API for issues(Stable) ///////////////////////////////////////
    def issues(params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issues = js.native
    
    def remove_watcher(id: Double, params: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    
    def update_issue(id: Double, issue: IssueData, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Issue = js.native
    
    /////////////////////////////////////// REST API for Common(Alpha) ///////////////////////////////////////
    def upload(content: js.Any, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): UploadResult = js.native
  }
  
  trait Issue extends StObject {
    
    var issue: IssueRecord
  }
  object Issue {
    
    @scala.inline
    def apply(issue: IssueRecord): Issue = {
      val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issue]
    }
    
    @scala.inline
    implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssue(value: IssueRecord): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueData extends StObject {
    
    var issue: IssueParams
  }
  object IssueData {
    
    @scala.inline
    def apply(issue: IssueParams): IssueData = {
      val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueData]
    }
    
    @scala.inline
    implicit class IssueDataMutableBuilder[Self <: IssueData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssue(value: IssueParams): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueParams extends StObject {
    
    var assigned_to_id: js.UndefOr[Double] = js.undefined
    
    var category_id: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var notes: js.UndefOr[String] = js.undefined
    
    var parent_issue_id: js.UndefOr[Double] = js.undefined
    
    var priority_id: js.UndefOr[Double] = js.undefined
    
    var project_id: js.UndefOr[Double] = js.undefined
    
    var status_id: js.UndefOr[Double] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var tracker_id: js.UndefOr[Double] = js.undefined
    
    var uploads: js.UndefOr[js.Array[UploadRecord]] = js.undefined
  }
  object IssueParams {
    
    @scala.inline
    def apply(): IssueParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IssueParams]
    }
    
    @scala.inline
    implicit class IssueParamsMutableBuilder[Self <: IssueParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssigned_to_id(value: Double): Self = StObject.set(x, "assigned_to_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigned_to_idUndefined: Self = StObject.set(x, "assigned_to_id", js.undefined)
      
      @scala.inline
      def setCategory_id(value: Double): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory_idUndefined: Self = StObject.set(x, "category_id", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setParent_issue_id(value: Double): Self = StObject.set(x, "parent_issue_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_issue_idUndefined: Self = StObject.set(x, "parent_issue_id", js.undefined)
      
      @scala.inline
      def setPriority_id(value: Double): Self = StObject.set(x, "priority_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority_idUndefined: Self = StObject.set(x, "priority_id", js.undefined)
      
      @scala.inline
      def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject_idUndefined: Self = StObject.set(x, "project_id", js.undefined)
      
      @scala.inline
      def setStatus_id(value: Double): Self = StObject.set(x, "status_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus_idUndefined: Self = StObject.set(x, "status_id", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setTracker_id(value: Double): Self = StObject.set(x, "tracker_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracker_idUndefined: Self = StObject.set(x, "tracker_id", js.undefined)
      
      @scala.inline
      def setUploads(value: js.Array[UploadRecord]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
      
      @scala.inline
      def setUploadsVarargs(value: UploadRecord*): Self = StObject.set(x, "uploads", js.Array(value :_*))
    }
  }
  
  trait IssueRecord extends StObject {
    
    var assigned_to: IssueRecordField
    
    var author: IssueRecordField
    
    var closed_on: String | Null
    
    var created_at: String
    
    var description: String
    
    var done_ratio: Double
    
    var due_date: String | Null
    
    var id: Double
    
    var is_private: Boolean
    
    var parent: js.UndefOr[IssueRecordField] = js.undefined
    
    var priority: IssueRecordField
    
    var project: IssueRecordField
    
    var start_date: String | Null
    
    var status: IssueRecordField
    
    var subject: String
    
    var total_estimated_hours: Double | Null
    
    var tracker: IssueRecordField
    
    var updated_at: String | Null
  }
  object IssueRecord {
    
    @scala.inline
    def apply(
      assigned_to: IssueRecordField,
      author: IssueRecordField,
      created_at: String,
      description: String,
      done_ratio: Double,
      id: Double,
      is_private: Boolean,
      priority: IssueRecordField,
      project: IssueRecordField,
      status: IssueRecordField,
      subject: String,
      tracker: IssueRecordField
    ): IssueRecord = {
      val __obj = js.Dynamic.literal(assigned_to = assigned_to.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], done_ratio = done_ratio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], closed_on = null, due_date = null, start_date = null, total_estimated_hours = null, updated_at = null)
      __obj.asInstanceOf[IssueRecord]
    }
    
    @scala.inline
    implicit class IssueRecordMutableBuilder[Self <: IssueRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssigned_to(value: IssueRecordField): Self = StObject.set(x, "assigned_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor(value: IssueRecordField): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed_on(value: String): Self = StObject.set(x, "closed_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed_onNull: Self = StObject.set(x, "closed_on", null)
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDone_ratio(value: Double): Self = StObject.set(x, "done_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDue_dateNull: Self = StObject.set(x, "due_date", null)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: IssueRecordField): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPriority(value: IssueRecordField): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: IssueRecordField): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_date(value: String): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_dateNull: Self = StObject.set(x, "start_date", null)
      
      @scala.inline
      def setStatus(value: IssueRecordField): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_estimated_hours(value: Double): Self = StObject.set(x, "total_estimated_hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_estimated_hoursNull: Self = StObject.set(x, "total_estimated_hours", null)
      
      @scala.inline
      def setTracker(value: IssueRecordField): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    }
  }
  
  trait IssueRecordField extends StObject {
    
    var id: Double
    
    var name: js.UndefOr[String] = js.undefined
  }
  object IssueRecordField {
    
    @scala.inline
    def apply(id: Double): IssueRecordField = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueRecordField]
    }
    
    @scala.inline
    implicit class IssueRecordFieldMutableBuilder[Self <: IssueRecordField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Issues extends StObject {
    
    var issues: js.Array[IssueRecord]
  }
  object Issues {
    
    @scala.inline
    def apply(issues: js.Array[IssueRecord]): Issues = {
      val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issues]
    }
    
    @scala.inline
    implicit class IssuesMutableBuilder[Self <: Issues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssues(value: js.Array[IssueRecord]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuesVarargs(value: IssueRecord*): Self = StObject.set(x, "issues", js.Array(value :_*))
    }
  }
  
  trait UploadRecord extends StObject {
    
    var content_type: js.UndefOr[String] = js.undefined
    
    var filename: String
    
    var token: String
  }
  object UploadRecord {
    
    @scala.inline
    def apply(filename: String, token: String): UploadRecord = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRecord]
    }
    
    @scala.inline
    implicit class UploadRecordMutableBuilder[Self <: UploadRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadResult extends StObject {
    
    var upload: UploadRecord
  }
  object UploadResult {
    
    @scala.inline
    def apply(upload: UploadRecord): UploadResult = {
      val __obj = js.Dynamic.literal(upload = upload.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadResult]
    }
    
    @scala.inline
    implicit class UploadResultMutableBuilder[Self <: UploadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpload(value: UploadRecord): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    }
  }
}
