package typings.nodeZendesk.mod

import typings.nodeZendesk.mod.Attachments.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var accountsettings: js.Any = js.native
  var activitystream: js.Any = js.native
  var attachments: Methods = js.native
  var brand: js.Any = js.native
  var categories: js.Any = js.native
  var customagentroles: js.Any = js.native
  var dynamiccontent: js.Any = js.native
  var forums: js.Any = js.native
  var forumsubscriptions: js.Any = js.native
  var groupmemberships: js.Any = js.native
  var groups: js.Any = js.native
  var helpers: js.Any = js.native
  var imports: js.Any = js.native
  var installations: js.Any = js.native
  var jobstatuses: typings.nodeZendesk.mod.JobStatuses.Methods = js.native
  var locales: js.Any = js.native
  var macros: typings.nodeZendesk.mod.Macros.Methods = js.native
  var oauthtokens: js.Any = js.native
  var organizationfields: js.Any = js.native
  var organizationmemberships: js.Any = js.native
  var organizations: js.Any = js.native
  var policies: js.Any = js.native
  var requests: typings.nodeZendesk.mod.Requests.Methods = js.native
  var satisfactionratings: js.Any = js.native
  var search: js.Any = js.native
  var sessions: js.Any = js.native
  var sharingagreement: js.Any = js.native
  var suspendedtickets: js.Any = js.native
  var tags: js.Any = js.native
  var targets: js.Any = js.native
  var ticketaudits: js.Any = js.native
  var ticketevents: js.Any = js.native
  var ticketexport: js.Any = js.native
  var ticketfields: js.Any = js.native
  var ticketforms: js.Any = js.native
  var ticketimport: js.Any = js.native
  var ticketmetrics: js.Any = js.native
  var tickets: typings.nodeZendesk.mod.Tickets.Methods = js.native
  var topiccomments: js.Any = js.native
  var topics: js.Any = js.native
  var topicsubscriptions: js.Any = js.native
  var topicvotes: js.Any = js.native
  var triggers: js.Any = js.native
  var userfields: typings.nodeZendesk.mod.Users.Fields.Methods = js.native
  var useridentities: typings.nodeZendesk.mod.Users.Identities.Methods = js.native
  var users: typings.nodeZendesk.mod.Users.Methods = js.native
  var views: js.Any = js.native
}

object Client {
  @scala.inline
  def apply(
    accountsettings: js.Any,
    activitystream: js.Any,
    attachments: Methods,
    brand: js.Any,
    categories: js.Any,
    customagentroles: js.Any,
    dynamiccontent: js.Any,
    forums: js.Any,
    forumsubscriptions: js.Any,
    groupmemberships: js.Any,
    groups: js.Any,
    helpers: js.Any,
    imports: js.Any,
    installations: js.Any,
    jobstatuses: typings.nodeZendesk.mod.JobStatuses.Methods,
    locales: js.Any,
    macros: typings.nodeZendesk.mod.Macros.Methods,
    oauthtokens: js.Any,
    organizationfields: js.Any,
    organizationmemberships: js.Any,
    organizations: js.Any,
    policies: js.Any,
    requests: typings.nodeZendesk.mod.Requests.Methods,
    satisfactionratings: js.Any,
    search: js.Any,
    sessions: js.Any,
    sharingagreement: js.Any,
    suspendedtickets: js.Any,
    tags: js.Any,
    targets: js.Any,
    ticketaudits: js.Any,
    ticketevents: js.Any,
    ticketexport: js.Any,
    ticketfields: js.Any,
    ticketforms: js.Any,
    ticketimport: js.Any,
    ticketmetrics: js.Any,
    tickets: typings.nodeZendesk.mod.Tickets.Methods,
    topiccomments: js.Any,
    topics: js.Any,
    topicsubscriptions: js.Any,
    topicvotes: js.Any,
    triggers: js.Any,
    userfields: typings.nodeZendesk.mod.Users.Fields.Methods,
    useridentities: typings.nodeZendesk.mod.Users.Identities.Methods,
    users: typings.nodeZendesk.mod.Users.Methods,
    views: js.Any
  ): Client = {
    val __obj = js.Dynamic.literal(accountsettings = accountsettings.asInstanceOf[js.Any], activitystream = activitystream.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], customagentroles = customagentroles.asInstanceOf[js.Any], dynamiccontent = dynamiccontent.asInstanceOf[js.Any], forums = forums.asInstanceOf[js.Any], forumsubscriptions = forumsubscriptions.asInstanceOf[js.Any], groupmemberships = groupmemberships.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any], jobstatuses = jobstatuses.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], macros = macros.asInstanceOf[js.Any], oauthtokens = oauthtokens.asInstanceOf[js.Any], organizationfields = organizationfields.asInstanceOf[js.Any], organizationmemberships = organizationmemberships.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], satisfactionratings = satisfactionratings.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], sharingagreement = sharingagreement.asInstanceOf[js.Any], suspendedtickets = suspendedtickets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], ticketaudits = ticketaudits.asInstanceOf[js.Any], ticketevents = ticketevents.asInstanceOf[js.Any], ticketexport = ticketexport.asInstanceOf[js.Any], ticketfields = ticketfields.asInstanceOf[js.Any], ticketforms = ticketforms.asInstanceOf[js.Any], ticketimport = ticketimport.asInstanceOf[js.Any], ticketmetrics = ticketmetrics.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any], topiccomments = topiccomments.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], topicsubscriptions = topicsubscriptions.asInstanceOf[js.Any], topicvotes = topicvotes.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], userfields = userfields.asInstanceOf[js.Any], useridentities = useridentities.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountsettings(value: js.Any): Self = this.set("accountsettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivitystream(value: js.Any): Self = this.set("activitystream", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachments(value: Methods): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrand(value: js.Any): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategories(value: js.Any): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomagentroles(value: js.Any): Self = this.set("customagentroles", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamiccontent(value: js.Any): Self = this.set("dynamiccontent", value.asInstanceOf[js.Any])
    @scala.inline
    def setForums(value: js.Any): Self = this.set("forums", value.asInstanceOf[js.Any])
    @scala.inline
    def setForumsubscriptions(value: js.Any): Self = this.set("forumsubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupmemberships(value: js.Any): Self = this.set("groupmemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroups(value: js.Any): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpers(value: js.Any): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def setImports(value: js.Any): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallations(value: js.Any): Self = this.set("installations", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobstatuses(value: typings.nodeZendesk.mod.JobStatuses.Methods): Self = this.set("jobstatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocales(value: js.Any): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def setMacros(value: typings.nodeZendesk.mod.Macros.Methods): Self = this.set("macros", value.asInstanceOf[js.Any])
    @scala.inline
    def setOauthtokens(value: js.Any): Self = this.set("oauthtokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationfields(value: js.Any): Self = this.set("organizationfields", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationmemberships(value: js.Any): Self = this.set("organizationmemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizations(value: js.Any): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicies(value: js.Any): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequests(value: typings.nodeZendesk.mod.Requests.Methods): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def setSatisfactionratings(value: js.Any): Self = this.set("satisfactionratings", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: js.Any): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessions(value: js.Any): Self = this.set("sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharingagreement(value: js.Any): Self = this.set("sharingagreement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuspendedtickets(value: js.Any): Self = this.set("suspendedtickets", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: js.Any): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargets(value: js.Any): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketaudits(value: js.Any): Self = this.set("ticketaudits", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketevents(value: js.Any): Self = this.set("ticketevents", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketexport(value: js.Any): Self = this.set("ticketexport", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketfields(value: js.Any): Self = this.set("ticketfields", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketforms(value: js.Any): Self = this.set("ticketforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketimport(value: js.Any): Self = this.set("ticketimport", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketmetrics(value: js.Any): Self = this.set("ticketmetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickets(value: typings.nodeZendesk.mod.Tickets.Methods): Self = this.set("tickets", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopiccomments(value: js.Any): Self = this.set("topiccomments", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopics(value: js.Any): Self = this.set("topics", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicsubscriptions(value: js.Any): Self = this.set("topicsubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicvotes(value: js.Any): Self = this.set("topicvotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggers(value: js.Any): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserfields(value: typings.nodeZendesk.mod.Users.Fields.Methods): Self = this.set("userfields", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseridentities(value: typings.nodeZendesk.mod.Users.Identities.Methods): Self = this.set("useridentities", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsers(value: typings.nodeZendesk.mod.Users.Methods): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def setViews(value: js.Any): Self = this.set("views", value.asInstanceOf[js.Any])
  }
  
}

