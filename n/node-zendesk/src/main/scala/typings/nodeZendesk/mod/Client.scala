package typings.nodeZendesk.mod

import typings.nodeZendesk.mod.Attachments.Methods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var accountsettings: Any
  
  var activitystream: Any
  
  var attachments: Methods
  
  var brand: Any
  
  var categories: Any
  
  var customagentroles: Any
  
  var dynamiccontent: Any
  
  var forums: Any
  
  var forumsubscriptions: Any
  
  var groupmemberships: Any
  
  var groups: typings.nodeZendesk.mod.Groups.Methods
  
  var helpers: Any
  
  var imports: Any
  
  var installations: Any
  
  var jobstatuses: typings.nodeZendesk.mod.JobStatuses.Methods
  
  var locales: Any
  
  var macros: typings.nodeZendesk.mod.Macros.Methods
  
  var oauthtokens: Any
  
  var organizationfields: Any
  
  var organizationmemberships: Any
  
  var organizations: typings.nodeZendesk.mod.Organizations.Methods
  
  var policies: Any
  
  var requests: typings.nodeZendesk.mod.Requests.Methods
  
  var satisfactionratings: Any
  
  var search: Any
  
  var sessions: Any
  
  var sharingagreement: Any
  
  var suspendedtickets: Any
  
  var tags: Any
  
  var targets: Any
  
  var ticketaudits: Any
  
  var ticketevents: Any
  
  var ticketexport: Any
  
  var ticketfields: typings.nodeZendesk.mod.Tickets.Fields.Methods
  
  var ticketforms: Any
  
  var ticketimport: Any
  
  var ticketmetrics: Any
  
  var tickets: typings.nodeZendesk.mod.Tickets.Methods
  
  var topiccomments: Any
  
  var topics: Any
  
  var topicsubscriptions: Any
  
  var topicvotes: Any
  
  var triggers: Any
  
  var userfields: typings.nodeZendesk.mod.Users.Fields.Methods
  
  var useridentities: typings.nodeZendesk.mod.Users.Identities.Methods
  
  var users: typings.nodeZendesk.mod.Users.Methods
  
  var views: Any
}
object Client {
  
  inline def apply(
    accountsettings: Any,
    activitystream: Any,
    attachments: Methods,
    brand: Any,
    categories: Any,
    customagentroles: Any,
    dynamiccontent: Any,
    forums: Any,
    forumsubscriptions: Any,
    groupmemberships: Any,
    groups: typings.nodeZendesk.mod.Groups.Methods,
    helpers: Any,
    imports: Any,
    installations: Any,
    jobstatuses: typings.nodeZendesk.mod.JobStatuses.Methods,
    locales: Any,
    macros: typings.nodeZendesk.mod.Macros.Methods,
    oauthtokens: Any,
    organizationfields: Any,
    organizationmemberships: Any,
    organizations: typings.nodeZendesk.mod.Organizations.Methods,
    policies: Any,
    requests: typings.nodeZendesk.mod.Requests.Methods,
    satisfactionratings: Any,
    search: Any,
    sessions: Any,
    sharingagreement: Any,
    suspendedtickets: Any,
    tags: Any,
    targets: Any,
    ticketaudits: Any,
    ticketevents: Any,
    ticketexport: Any,
    ticketfields: typings.nodeZendesk.mod.Tickets.Fields.Methods,
    ticketforms: Any,
    ticketimport: Any,
    ticketmetrics: Any,
    tickets: typings.nodeZendesk.mod.Tickets.Methods,
    topiccomments: Any,
    topics: Any,
    topicsubscriptions: Any,
    topicvotes: Any,
    triggers: Any,
    userfields: typings.nodeZendesk.mod.Users.Fields.Methods,
    useridentities: typings.nodeZendesk.mod.Users.Identities.Methods,
    users: typings.nodeZendesk.mod.Users.Methods,
    views: Any
  ): Client = {
    val __obj = js.Dynamic.literal(accountsettings = accountsettings.asInstanceOf[js.Any], activitystream = activitystream.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], customagentroles = customagentroles.asInstanceOf[js.Any], dynamiccontent = dynamiccontent.asInstanceOf[js.Any], forums = forums.asInstanceOf[js.Any], forumsubscriptions = forumsubscriptions.asInstanceOf[js.Any], groupmemberships = groupmemberships.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any], jobstatuses = jobstatuses.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], macros = macros.asInstanceOf[js.Any], oauthtokens = oauthtokens.asInstanceOf[js.Any], organizationfields = organizationfields.asInstanceOf[js.Any], organizationmemberships = organizationmemberships.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], satisfactionratings = satisfactionratings.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], sharingagreement = sharingagreement.asInstanceOf[js.Any], suspendedtickets = suspendedtickets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], ticketaudits = ticketaudits.asInstanceOf[js.Any], ticketevents = ticketevents.asInstanceOf[js.Any], ticketexport = ticketexport.asInstanceOf[js.Any], ticketfields = ticketfields.asInstanceOf[js.Any], ticketforms = ticketforms.asInstanceOf[js.Any], ticketimport = ticketimport.asInstanceOf[js.Any], ticketmetrics = ticketmetrics.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any], topiccomments = topiccomments.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], topicsubscriptions = topicsubscriptions.asInstanceOf[js.Any], topicvotes = topicvotes.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], userfields = userfields.asInstanceOf[js.Any], useridentities = useridentities.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setAccountsettings(value: Any): Self = StObject.set(x, "accountsettings", value.asInstanceOf[js.Any])
    
    inline def setActivitystream(value: Any): Self = StObject.set(x, "activitystream", value.asInstanceOf[js.Any])
    
    inline def setAttachments(value: Methods): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: Any): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCustomagentroles(value: Any): Self = StObject.set(x, "customagentroles", value.asInstanceOf[js.Any])
    
    inline def setDynamiccontent(value: Any): Self = StObject.set(x, "dynamiccontent", value.asInstanceOf[js.Any])
    
    inline def setForums(value: Any): Self = StObject.set(x, "forums", value.asInstanceOf[js.Any])
    
    inline def setForumsubscriptions(value: Any): Self = StObject.set(x, "forumsubscriptions", value.asInstanceOf[js.Any])
    
    inline def setGroupmemberships(value: Any): Self = StObject.set(x, "groupmemberships", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: typings.nodeZendesk.mod.Groups.Methods): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setHelpers(value: Any): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setImports(value: Any): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setInstallations(value: Any): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    
    inline def setJobstatuses(value: typings.nodeZendesk.mod.JobStatuses.Methods): Self = StObject.set(x, "jobstatuses", value.asInstanceOf[js.Any])
    
    inline def setLocales(value: Any): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setMacros(value: typings.nodeZendesk.mod.Macros.Methods): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
    
    inline def setOauthtokens(value: Any): Self = StObject.set(x, "oauthtokens", value.asInstanceOf[js.Any])
    
    inline def setOrganizationfields(value: Any): Self = StObject.set(x, "organizationfields", value.asInstanceOf[js.Any])
    
    inline def setOrganizationmemberships(value: Any): Self = StObject.set(x, "organizationmemberships", value.asInstanceOf[js.Any])
    
    inline def setOrganizations(value: typings.nodeZendesk.mod.Organizations.Methods): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setPolicies(value: Any): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: typings.nodeZendesk.mod.Requests.Methods): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setSatisfactionratings(value: Any): Self = StObject.set(x, "satisfactionratings", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSessions(value: Any): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSharingagreement(value: Any): Self = StObject.set(x, "sharingagreement", value.asInstanceOf[js.Any])
    
    inline def setSuspendedtickets(value: Any): Self = StObject.set(x, "suspendedtickets", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTicketaudits(value: Any): Self = StObject.set(x, "ticketaudits", value.asInstanceOf[js.Any])
    
    inline def setTicketevents(value: Any): Self = StObject.set(x, "ticketevents", value.asInstanceOf[js.Any])
    
    inline def setTicketexport(value: Any): Self = StObject.set(x, "ticketexport", value.asInstanceOf[js.Any])
    
    inline def setTicketfields(value: typings.nodeZendesk.mod.Tickets.Fields.Methods): Self = StObject.set(x, "ticketfields", value.asInstanceOf[js.Any])
    
    inline def setTicketforms(value: Any): Self = StObject.set(x, "ticketforms", value.asInstanceOf[js.Any])
    
    inline def setTicketimport(value: Any): Self = StObject.set(x, "ticketimport", value.asInstanceOf[js.Any])
    
    inline def setTicketmetrics(value: Any): Self = StObject.set(x, "ticketmetrics", value.asInstanceOf[js.Any])
    
    inline def setTickets(value: typings.nodeZendesk.mod.Tickets.Methods): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    inline def setTopiccomments(value: Any): Self = StObject.set(x, "topiccomments", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: Any): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsubscriptions(value: Any): Self = StObject.set(x, "topicsubscriptions", value.asInstanceOf[js.Any])
    
    inline def setTopicvotes(value: Any): Self = StObject.set(x, "topicvotes", value.asInstanceOf[js.Any])
    
    inline def setTriggers(value: Any): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setUserfields(value: typings.nodeZendesk.mod.Users.Fields.Methods): Self = StObject.set(x, "userfields", value.asInstanceOf[js.Any])
    
    inline def setUseridentities(value: typings.nodeZendesk.mod.Users.Identities.Methods): Self = StObject.set(x, "useridentities", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: typings.nodeZendesk.mod.Users.Methods): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
